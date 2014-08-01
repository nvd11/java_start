package Stream_kng.DataStream_kng;

import java.io.*;

public class DataStream2{
    public static void f(){
        try{
            g();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void g() throws IOException{
        int i = 1229935882;

        File f = new File("/home/gateman/tmp/testStream1.txt");
        if (f.exists()){
            f.delete();
        }

        f.createNewFile();

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeInt(i);
        dos.flush();
        dos.close();
        
        System.out.printf("done!!\n"); 
    }
}
