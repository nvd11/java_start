package Stream_kng;

import java.io.*;

public class Writer2{
    public static void f(){
        int i;
        String s = new String("Just a testing for writer stream!\n");
        File fl = new File("/home/gateman/tmp/testwriter1.txt");
        if (fl.exists()){
            fl.delete();
        }
        
        try{
            fl.createNewFile();
        }catch(IOException e){
            System.out.println("File created failed!");
        }
        System.out.println("File created!");

       
        FileWriter fw = null;
        try{
           fw = new FileWriter(fl); 
        }catch(IOException e){
            System.out.println("Create filewriter fail!");
            return;
        } 

        for (i=0; i<s.length(); i++){
            try{
                fw.write(s.charAt(i));
            }catch(IOException e){
                System.out.println("error occurs in fw.write()!");
            }
        }

        try{
            fw.flush();
        }catch(IOException e){
            System.out.println("error occurs in fw.flush()");
        }
        
       // try{
       //     fw.close();
       // }catch(IOException e){
       //     System.out.println("Close the filewriter failed!");
       //     return;
       // }
       // System.out.println("Close the filewriter successfully!");
        System.out.println("done!");

    }    
}

