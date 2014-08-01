package Stream_kng.DataStream_kng;

import java.io.*;

public class DataStream1{
    public static void f(){
        double fi = 12345.678;
        double fo = 0;
        byte[] bSend;
        byte[] bGet;
        try{
            bSend = Send(fi);

            //network.........
            bGet = bSend;

            fo = Get(bGet);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.printf("fo is %f\n",fo); 
    }

    private static byte[] Send(double f) throws IOException{
        byte[] bArr = new byte[64];
        //the core byteArray is built in. and the 1024 is buffer size
        ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);

        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeDouble(f);//this method will create a new byte[] object
        bArr = bos.toByteArray();
        dos.close(); // bos will be cloased cascade
        return bArr; 
    }

    private static double Get(byte[] bArr) throws IOException{
        double f;
        ByteArrayInputStream bis = new ByteArrayInputStream(bArr);

        DataInputStream dis = new DataInputStream(bis);

        f = dis.readDouble();
        dis.close();
        return f;
    }
}
