import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TCPServer1{
    private static int port = 10019;

    public static void main(String[] args){
        try{
            tcpServer();
        }
        catch(Exception e){
            e.printStackTrace();    
        }
    }

    public static void tcpServer() throws Exception{
        //ServerSocket is Factory of Socket, 
        ServerSocket ss = new ServerSocket(port);

        //a loop to list the port
        while(true){
            //Function accept is a blocking method, will listing the port, untill get a connect
            //request from a client. it means if no any request form client,
            //the program will keep waiting here...
            //
            //After got a connect request from a client, the ServerSocket will package
            //the connection to a Socket Object 
            //
            //The socket.getInputStream of Server is the same one with the socket.getOutputStream of Client.
            //The socket.getOutputStream of Server is the same one with the socket.getInputStream of Client.
            Socket s = ss.accept();

            System.out.println("A connection is setup!");

            //get a feedback to clent
            DataInputStream dis = new DataInputStream(s.getInputStream());

            //print the message from client, readUTF() is also a blocking method.
            System.out.println(dis.readUTF()); 

            //send a feedback to client.
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Your message is sent to Server successfully!");

            dis.close();
            dos.close();
            s.close();
        }
    }
}
