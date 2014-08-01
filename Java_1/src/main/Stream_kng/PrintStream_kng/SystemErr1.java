package Stream_kng.PrintStream_kng;

import java.io.*;

public class SystemErr1{

    public static void f(){
        try{
            g();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void h() throws IOException{
        throw new IOException("Shit !!! / by zero!");
    }

    public static void g() throws Exception{
        int i = 0;
        int j =0;
        File f = new File("/home/gateman/tmp/testStream4.txt");

        if (f.exists()){
            f.delete();
        }

        FileOutputStream fos = new FileOutputStream(f);
        PrintStream ps = new PrintStream(fos,true); // autoflush = true;
        // PrintStream ps = new PrintStream(f); //another constructor;
        
        try{
          j = 3 / i;  
        }catch(Exception e){
            System.err.println("this err msg will be printed to monitor!");
            e.printStackTrace();
        }
        
        System.setErr(ps);

        try{
           h(); 
        }catch(Exception e){
            System.err.println("this err msg will be printed to file!");
            e.printStackTrace();
        }
        
        ps.close();
    }
}

