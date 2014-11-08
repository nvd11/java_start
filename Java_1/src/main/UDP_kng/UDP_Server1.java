package UDP_kng;

import UDP_kng.*;
import java.io.*;
import java.net.*;

public class UDP_Server1{
    public static int port = 9001;

    public static void f() throws Exception{
        DatagramPacket dataPacket;
        UDP_SocketReceive uReceiver = new UDP_SocketReceive(port);
        while(true){
            System.out.println("Listening port....");
            dataPacket =  uReceiver.receive();
            printMsg(dataPacket);        

        }
    }

    public static void printMsg(DatagramPacket dataPacket) throws Exception{
        ByteArrayInputStream bis = new ByteArrayInputStream(dataPacket.getData());
        DataInputStream dis = new DataInputStream(bis);
        String msg = dis.readLine();

        System.out.println("msg: " + msg);
        dis.close();
    }
        
}
