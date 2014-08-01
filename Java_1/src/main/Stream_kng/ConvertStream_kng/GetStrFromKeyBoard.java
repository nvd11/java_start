package Stream_kng.ConvertStream_kng;

import java.io.*;

public class GetStrFromKeyBoard{
    public static void f(){
        String s = null;
        System.out.println("please input some words, type Enter to exit:");
        try{
            s = getStr();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("words your just input is:");
        System.out.println(s); 

    }
    

    public static String getStr() throws IOException{
        StringBuffer sbuffer = new StringBuffer(1024);
        int ic = 0;
        char c;

        Reader r = new InputStreamReader(System.in);
        ic = r.read();
        c=(char)ic;
        while(c != '\n'){
            sbuffer.append(c);
            ic = r.read();
            c=(char)ic;
        }
        r.close();
        return sbuffer.toString();   
    }

    
}
