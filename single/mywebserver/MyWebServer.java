import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer{
    public static int port = 10010;
    public static String mainPagePath = "/home/gateman/Studies/Java/java_start/single/mywebserver/index.html";

    public static void main(String[] args){
        try{
            serverStart();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void serverStart() throws Exception{
        ServerSocket ss = new ServerSocket(port);
        File fileMainPage = new File(mainPagePath);
        byte[] bArr = new byte[8];
        int len;

        while(true){
            Socket s = ss.accept();
            System.out.println("get a Connection request!"); 

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileMainPage));
            BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
            len = bis.read(bArr);
            while(-1 != len){
                bos.write(bArr,0,len); //maybe there's some previous data after len of the bArr 
                len = bis.read(bArr);
            }
         
            bos.flush();
            bos.close(); 
            bis.close();
            s.close(); 
        }
    }
}
