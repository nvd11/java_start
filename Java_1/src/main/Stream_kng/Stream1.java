package Stream_kng;
import java.io.*;

public class Stream1{
    public static void f() throws IOException{
       FileReader fr = new FileReader("/home/gateman/tmp/build.xml");

       int ch; //not char
       ch = fr.read(); //throws IOEXCEPTION
       while(ch > -1){ //if ch = -1, means got the end of the file
           System.out.printf("%c",(char)ch);
           ch = fr.read(); //throws IOEXCEPTION
       }
    }
}
