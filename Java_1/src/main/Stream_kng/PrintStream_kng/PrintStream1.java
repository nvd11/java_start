package Stream_kng.PrintStream_kng;

import java.io.*;

public class PrintStream1{
    public static void f(){
        try{
            g();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void g() throws IOException{
        int i = 1229935882;

        File f = new File("/home/gateman/tmp/testStream2.txt");
        if (f.exists()){
            f.delete();
        }

        f.createNewFile();

        FileOutputStream fos = new FileOutputStream(f);
        PrintStream ps = new PrintStream(fos);
        
        ps.print(i);
        ps.print('\n');
        ps.flush();
        ps.close();
        
        System.out.printf("done!!\n"); 
    }
}
