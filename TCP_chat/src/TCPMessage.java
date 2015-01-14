import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.Arrays;

public class TCPMessage{

    //if true, means this object is builded from makeMsg(String),
    //otherwise means this object is builded from make Msg(byte[]).
    private boolean buildFlag;
    
    private byte[] byteArr;
    private String sMsg;

    private static ByteArrayOutputStream baos = null;
    private static DataOutputStream dos = null;
    private static ByteArrayInputStream bais = null;
    private static DataInputStream dis = null; 

    //singleton
    private static TCPMessage tmsg = new TCPMessage();
    private static boolean startedFlag = false;
    private TCPMessage(){

    }

    //use try catch to instanate the Streams
    private void tStart(){
        try{
            baos = new ByteArrayOutputStream();
            dos = new DataOutputStream(baos);
            bais = new ByteArrayInputStream(this.byteArr);
            dis = new DataInputStream(bais);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPMessage start fail!");
        }
        startedFlag = true;
    }

    public void tClose(){
        if (true == startedFlag){
            try{
                dos.close();
                dis.close();
            }catch(Exception e){
                e.printStackTrace();
                System.err.println("TCPMessage close fail1");
            }
        }
    }

    public static TCPMessage MakeMsg(String str){
        tmsg.sMsg = str;
        tmsg.byteArr = null;
        if (false == tmsg.startedFlag){
            tmsg.tStart();    
        }

        return tmsg;
    }

    public static TCPMessage MakeMsg(byte[] bArr){
        tmsg.sMsg = null;
        tmsg.byteArr = Arrays.copyOf(bArr,bArr.length);
        if (false == tmsg.startedFlag){
            tmsg.tStart();    
        }

        return tmsg;
    }
    
    public byte[] getByteArr(){
        if (false == this.buildFlag){
            return this.byteArr; 
        }

        try{
            baos.reset();
            dos.writeBytes(this.sMsg);
            dos.flush();
            this.byteArr = baos.toByteArray(); //pointer copy, not value copy
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPMessage get byteArr fail!");
        }


        return this.byteArr;
    }

    public String getMsg(){
        if (true == this.buildFlag){
            return this.sMsg;
        }

        String tmpStr;
        this.sMsg = "";
        try{
            bais.reset();
            tmpStr = dis.readLine(); 
            while(null != tmpStr){
                   this.sMsg += tmpStr;
                   tmpStr = dis.readLine(); 
            }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPMessage get Message string fail!");
        }

        return this.sMsg;
    }

}
