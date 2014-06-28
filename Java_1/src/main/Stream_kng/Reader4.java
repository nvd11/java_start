package Stream_kng;
import java.io.*;
import java.util.ArrayList;
import java.lang.Integer;

public class Reader4{
    public static void f(){
       int startIdx = 4;
       int rLength = 14;
       FileReader fr = null; // = null is very important, otherwise it will not pass the compilation, popup the error "fr may not be initailed"
       char[] cbuffer = new char[20]; //not char
       int len; //throws IOEXCEPTION
       ArrayList<Integer> lenarr = new ArrayList<Integer>();
       
       try{
            fr = new FileReader("/home/gateman/tmp/build.xml");
            do{
                len = fr.read(cbuffer, startIdx, rLength); //if ch = -1, means got the end of the file
                lenarr.add(len);
                charArrPrint(cbuffer,startIdx,len);
            }while(len > -1); //if ch = -1, means got the end of the file
        }
       catch(FileNotFoundException e){
            System.out.println("File not found!");
       }
       catch(IOException e){
            System.out.println("IO Problem!");
            e.printStackTrace();
       }
       catch(Exception e){
            e.printStackTrace();
       }
       finally{
            if (null != fr){
                try{
                    fr.close();
                }
                catch(IOException e){
                     System.out.println("failed to close the reader!");
                }
            }     
       }
       
       System.out.println("==============================");
       System.out.println(lenarr);

    }

    public static void charArrPrint(char[] cbuffer, int startIdx, int len){
        int i ;
        for (i=0; i < len; i++){
            System.out.printf("%c",cbuffer[i + startIdx]);
        }
    }
}
