import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer3{
    public static int port = 10010;
    public final static String mainPagePath = "/home/gateman/Studies/Java/java_start/single/mywebserver/index.html";

    public static void main(String[] args){
        try{
            serverStart();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void serverStart() throws Exception{
        final ServerSocket ss = new ServerSocket(port);
        final File fileMainPage = new File(mainPagePath);
        final byte[] bArr = new byte[8];

        while(true){
            new Thread(){
                @Override
                public void run(){
                    try{
                        Socket s = ss.accept();
                        System.out.println("get a Connection request!"); 

                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileMainPage));
                        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
                        int len = bis.read(bArr);
                        while(-1 != len){
                            bos.write(bArr,0,len); //maybe there's some previous data after len of the bArr 
                            len = bis.read(bArr);
                        }
         
                        bos.flush();
                        bos.close(); 
                        bis.close();
                        s.close(); 
                    }catch(Exception e){
                        e.printStackTrace();
                    }   
                }
            }.start();
        }
    }
}
