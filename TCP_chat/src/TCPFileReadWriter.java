import java.io.RandomAccessFile;
import java.io.File;



public class TCPFileReadWriter{

    private File fFile = null;
    private boolean startedFlag = false;
    private RandomAccessFile raf = null;

    private boolean fStart(){
        try{
            raf = new RandomAccessFile(fFile,"rw");
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPPasswordReadWriter: pstart fail!");
            return false;    
        }
        this.startedFlag = true;
        return true;
    }

    public void fClose(){
        try{
            raf.close();
            this.startedFlag = false;
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPPasswordReadWriter: pClose faile1");
        }

    }

    private TCPFileReadWriter(){
        
    }

    public static TCPFileReadWriter getObject(File f){
        TCPFileReadWriter frw = new TCPFileReadWriter();
        frw.fFile = f;
        if (false == frw.fStart()){
            return null;
        } 

        return frw;
    }

    //write a String to the file
    public boolean writeString(String str){
        if(false == this.startedFlag){
            System.err.println("TcpFileReadWriter: this object is closed already");
            return false;
        }
    
        try{
            raf.writeChars(str);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPFileReadWriter: writeString fail!!");
            return false;
        }

        return true; 
    }

    public String readFileLine(){
        if(false == this.startedFlag){
            System.err.println("TcpFileReadWriter: this object is closed already");
            return null;
        }
    
        String str = null;
        try{
            str = raf.readLine();
        }catch(Exception e){
            e.printStackTrace();            
            System.err.println("TcpFileReadWriter: readFileLine Fail!");
            return null;
        }

        return str;
    }

    public boolean fReset(){
        if(false == this.startedFlag){
            System.err.println("TcpFileReadWriter: this object is closed already");
            return false;
        }
    
        try{
            raf.seek(0);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TcpFileReadWriter: fReset fail!!");
            return false;
        }

        return true;
    }







}
