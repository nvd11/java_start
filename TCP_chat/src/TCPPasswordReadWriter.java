import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.HashMap;


public class TCPPasswordReadWriter{
    private File pwdFile = null;
    private String synFlag = "synFlag"; //object for synchronized
    private HashMap hMap;

    //singleton
    private static TCPPasswordReadWriter pwr = new TCPPasswordReadWriter();
    private TCPPasswordReadWriter(){

    }
    
    public static TCPPasswordReadWriter CreateObj(String fStr){
        //create file object
        try{
            pwr.pwdFile = new File(fStr);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Password file error!");
            return null;
        }

        return pwr;
    }


}
