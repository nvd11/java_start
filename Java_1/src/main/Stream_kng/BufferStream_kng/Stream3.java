package Stream_kng.BufferStream_kng;

import java.io.*;

public class Stream3{

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

        byte[] byteArr = new byte[512]; //use a buffer instead of a byte
        int len;
        try{
            len = fi.read(byteArr);
            while(-1 != len){
                fo.write(byteArr,0,len);
                len = fi.read(byteArr);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            fo.flush();
        }catch(IOException e){
            System.out.println("Exception in flush()");
        }finally{
            if (null != fo){
                try{
                    fo.close();
                }catch(IOException e){
                    System.out.println("Exception in fo.close()");
                }
            }
           
            if (null != fi){
                try{
                    fi.close();
                }catch(IOException e){
                    System.out.println("Exception in fi.close()");
                }
            }
        }

        System.out.println("copy done!!");
    }
}
