package UDP_kng;

import java.net.*;
import java.io.*;

public class UDP_SocketSend{
    private boolean startedFlag;
    private InetAddress ipSend;
    private DatagramSocket dataSocket; //it just like a wharf or port
    private DatagramPacket dataPacket = new DatagramPacket(new byte[1],0); //it just like a container

    public UDP_SocketSend(){
        this.startedFlag = false;
    }    

    //build a wharf
    public int start(){
        if (true == this.startedFlag){
            System.out.println("Err: This UDP Client is started..");
            return -2;
        }

        try{
            dataSocket = new DatagramSocket();
            System.out.println("This socket started successfully!!");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Err: Failed to instantiate a UDP Socket..!!");
            return -1;
        }
                
        this.startedFlag = true;
        return 0;
    }

    public int close(){
        if (false == this.startedFlag){
            System.err.println("Err: The socket is not started yet!");
            return -2;
        }

        try{
            dataSocket.close();  //once the socket is closed, it cannot be reopen, we hava to new another socket if we want to sendout data.
            System.out.println("this socket closed successfully!!");
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Err: Fail to close the Socket!!");
            return -1;
        }

        this.startedFlag = false;
        return 0;
    }

    public int send(byte[] bArr,int sLength, String ip, int port){
        if (false == this.startedFlag){
            System.err.println("Err: The socket is not started yet!");
            return -2;
        }

        if (0 >= port){
            System.err.println("Err: The port provided is not vaild!");
            return -1;
        }
        
        try{
            ipSend = InetAddress.getByName(ip); 
        }catch(Exception e){
            System.err.println("Err: Failed to setup the ip address!");
        }

        dataPacket.setPort(port); //attach a label
        dataPacket.setData(bArr,0,sLength); //put the data into this container
        dataPacket.setAddress(ipSend);

        try{
            dataSocket.send(dataPacket);  //send out the container to ipSend
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Err: Failed to send out the data package!");
            return -3;
        }

        return 0;
    }

   // public static void printStr(byte[] bArr, int sLength) throws Exception{
   //     ByteArrayInputStream bais = new ByteArrayInputStream(bArr);
   //     byte[] bArr2 = new byte[1024];

   //     bais.read(bArr2,0,sLength);
   //     bais.close();

   //     bais = new ByteArrayInputStream(bArr2);
   //     DataInputStream dis = new DataInputStream(bais);
   //     String str = dis.readLine();
   //     System.out.println("Msg is : " + str);
   // }  
}

        
