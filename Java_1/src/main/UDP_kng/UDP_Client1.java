package UDP_kng;

import java.net.*;
import java.io.*;
import UDP_kng.*;

public class UDP_Client1{
    private static int port = 9001;
    private static String ip = "127.0.0.1";
    public static void f() throws Exception{
        ByteArrayOutputStream bas = new ByteArrayOutputStream();    
        DataOutputStream dos = new DataOutputStream(bas);
        DataInputStream dis = new DataInputStream(System.in);
        UDP_SocketSend uSender = new UDP_SocketSend();
        uSender.start();

        System.out.println("Please input your message, type EOF to exit.");
        String msg = dis.readLine();

        while(msg != "EOF"){
            System.out.println("msg: " + msg);
            bas.reset();
            dos.writeBytes(msg);
            dos.flush();
            System.out.println(bas.size());
            uSender.send(bas.toByteArray(), bas.size(),ip, port);
            System.out.println("Please input your message, type EOF to exit.");
            msg = dis.readLine();
        }


        uSender.close();
        dos.close();
        dis.close();
        //uSender.send(dstream.toByteArray(),"127.0.0.1", port);
        
    } 
}
