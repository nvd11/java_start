package Stream_kng.PrintStream_kng;

import java.io.*;

public class SystemOut1{

    public static void f(){
        try{
            g();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void g() throws IOException{
        PrintStream screenOS = System.out;//marked down
        System.out.println("It will be printed to monitor!");
        
        File f = new File("/home/gateman/tmp/testStream3.txt");

        if (f.exists()){
            f.delete();
        }

        FileOutputStream fos = new FileOutputStream(f);
        PrintStream ps = new PrintStream(fos,true); // autoflush = true;
        // PrintStream ps = new PrintStream(f); //another constructor;
        
        System.setOut(ps);
        System.out.println("It will be printed to file!");

        System.setOut(screenOS);// set to default value
        System.out.println("It will be printed to monitor again!");
        
        ps.close();



    }
}

