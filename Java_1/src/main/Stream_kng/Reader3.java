package Stream_kng;
import java.io.*;
import java.util.ArrayList;
import java.lang.Integer;

public class Reader3{
    public static void f() throws IOException{
       int startIdx = 4;
       int rLength = 13;
       FileReader fr = new FileReader("/home/gateman/tmp/build.xml");

       char[] cbuffer = new char[20]; //not char
       int len; //throws IOEXCEPTION
       ArrayList<Integer> lenarr = new ArrayList<Integer>();
       
       do{
            len = fr.read(cbuffer, startIdx, rLength); //if ch = -1, means got the end of the file
            lenarr.add(len);
            charArrPrint(cbuffer,startIdx,len);
       }while(len > -1); //if ch = -1, means got the end of the file
       
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
