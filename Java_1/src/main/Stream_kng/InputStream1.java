package Stream_kng;
import java.io.*;

public class InputStream1{
    public static void f(){
       FileInputStream fis = null;
       try{
           fis = new FileInputStream("/home/gateman/tmp/build.xml");
       }catch(FileNotFoundException e){
           System.out.println("file not found!");
           return;
       }


       int bt; //byte
       try{
            bt = fis.read();
            while(bt > -1){
                System.out.printf("%c",(char)bt);
                bt = fis.read();
            }
       }catch(IOException e){
           System.out.println("IOException!");
           e.printStackTrace();
       }finally{
           if (null != fis){
               System.out.println("============");
               try{
                   fis.close();
               }catch(IOException e){
                   System.out.println("Stream close failed!");
                   return;
               }
               System.out.println("Stream close successfully!");
           }
       }
    }
}
