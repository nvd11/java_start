package Stream_kng;
import java.io.*;

public class Reader1{
    public static void f() throws IOException{
       FileReader fr = new FileReader("/home/gateman/tmp/build.xml");

       char[] cbuffer = new char[20]; //not char
       int len = fr.read(cbuffer); //throws IOEXCEPTION
       System.out.println(cbuffer);
       System.out.printf("len is %d\n",len);
       System.out.println("===================");
       while(len > -1){ //if ch = -1, means got the end of the file
            len = fr.read(cbuffer); //throws IOEXCEPTIO
            System.out.println(cbuffer);
            System.out.printf("len is %d\n",len);
            System.out.println("===================");
       }
    }
}
