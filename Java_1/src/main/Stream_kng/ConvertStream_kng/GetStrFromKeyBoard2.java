package Stream_kng.ConvertStream_kng;

import java.io.*;

public class GetStrFromKeyBoard2{
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
    

    private static String getStr() throws IOException{
        String s = null;
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        s = br.readLine();
        

        r.close();
        return s;   
    }

    
}
