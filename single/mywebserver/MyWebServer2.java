import java.io.OutputStreamWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer2{
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
        String str = null;
        
        while(true){
            Socket s = ss.accept();
            System.out.println("get a Connection request!"); 

            BufferedReader br = new BufferedReader(new FileReader(fileMainPage));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            str = br.readLine();
            while(null != str){
                bw.write(str, 0, str.length());
                bw.newLine();
                str = br.readLine();
            }
         
            bw.flush();
            bw.close(); 
            br.close();
            s.close(); 
        }
    }
}
