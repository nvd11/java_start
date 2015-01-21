import java.net.Socket;
import java.io.*;

public class TCPClient1{
    public static String targetIP = "192.168.1.107";
    public static int port = 10019;

    public static void main(String[] args){
        try{
            tcpClient();
        }catch(Exception e){
            e.printStackTrace();
        }    
    }

    public static void tcpClient() throws Exception{
        //Once the Socket Object is created, it will send the connect request to
        //Server, if the connection failed to connect, will prompt excepions..
        //
        //yes, it needs the listing method(socket.accept()) running in Server side.
        Socket s = new Socket(targetIP, port);

        //if no any exception
        //Send a message to Server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hi Server!");
        dos.flush();

        //try to get message from Server
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());

        dos.close();
        dis.close();
        s.close();
    }
}
