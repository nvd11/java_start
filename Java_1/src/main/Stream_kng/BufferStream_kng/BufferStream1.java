package Stream_kng.BufferStream_kng;

import java.io.*;

public class BufferStream1{

    public static void f(){
        FileInputStream fi = null;
        try{
            fi = new FileInputStream("/home/gateman/Music/Nickelback - Rockstar.flac");
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }

        FileOutputStream fo = null;
        try{
            fo = new FileOutputStream("/home/gateman/tmp/Rockstar.flac");
        }catch(Exception e){
            System.out.println("error in file output stream's creation");
            e.printStackTrace();
        }

        //bufferStream
        BufferedInputStream bis = new BufferedInputStream(fi,512);
        BufferedOutputStream bos = new BufferedOutputStream(fo,512);
        

        int byt;
        try{
            byt = bis.read();
            while(-1 != byt){
                bos.write(byt);
                byt = bis.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            bos.flush();
        }catch(IOException e){
            System.out.println("Exception in flush()");
        }finally{
            if (null != bos){
                try{
                    bos.close();
                }catch(IOException e){
                    System.out.println("Exception in bos.close()");
                }
            }
           
            if (null != bis){
                try{
                    bis.close();
                }catch(IOException e){
                    System.out.println("Exception in bis.close()");
                }
            }

        }

        System.out.println("copy done!!");
    }
}
