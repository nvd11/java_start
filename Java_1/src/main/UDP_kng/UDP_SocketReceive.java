package UDP_kng;

import java.net.*;
import java.util.Arrays;

public class UDP_SocketReceive{
    private DatagramSocket dataSocket; //just like a wharf
    private byte[] bArr = new byte[1024];
    private DatagramPacket dataPacket = new DatagramPacket(bArr,bArr.length); //just like a container
    private int port;
    private boolean startedFlag = false;

    public UDP_SocketReceive(int port){
        this.port = port;
        this.start(); 
    } 

    public int start(){
        if (true == startedFlag){
            System.err.println("This socket is stated already!");
            return -1;
        }

        try{
            dataSocket = new DatagramSocket(this.port);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("fail to new a DatagramSocket, please try to start once again!");
            this.startedFlag = false;
            return -2;
        }

        this.startedFlag = true;

        return 0;
    } 

    public DatagramPacket receive(){
        if (false == startedFlag){
            System.err.println("This socket is not stated yet!");
            return null;
        }

        byte b = 0;
        Arrays.fill(bArr,b); //clean the dataPacket, avoid to show previous data.
    
        try{
            dataSocket.receive(this.dataPacket);//after this step, the container have got the data from sender.
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Failed receive a datapackage!");
            return null;
        }

        return dataPacket;
    }
    

}
