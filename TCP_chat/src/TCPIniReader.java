import java.io.File;
import org.jdom.*;

public class TCPIniReader{
    private static String clsPath = new TCPIniReader().getClass().getResource(File.separator).getPath(); 
    private static String tmpPath = clsPath.substring(0,clsPath.lastIndexOf(File.separator));
    public static String appPath = tmpPath.substring(0,tmpPath.lastIndexOf(File.separator));  
    private static String fileStr = appPath + File.separator + "TCPChat.ini";
    private static File iniFile = null;
    private static TCPFileReadWriter frw = null;


    private static boolean checkFile(){
        if (null != iniFile && null != frw){
            return true;
        }

        try{
            iniFile = new File(fileStr);
            frw = TCPFileReadWriter.getObject(iniFile);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("TCPIniReader: checkfile fail!");
            return false;
        }

        return true;
    }

    public static String readValue(String sSection, String sConfigNm){
        if (false == checkFile()){
            return null;
        }

        System.out.println("1");

        String sRow = null;
        frw.fReset();
        sRow = frw.readFileLine();
        while(null != sRow){
            if (sRow.equals("["+ sSection +"]")){   //cannot use "=="
                //find the section
                sRow = frw.readFileLine(); //next row
                while((null != sRow) && ('[' != sRow.charAt(0) && ']' != sRow.charAt(sRow.length() - 1))){
                    //System.out.println(sRow);
                    //java
                    sRow = frw.readFileLine();
                }
                break;
            }

            sRow = frw.readFileLine();       
        }

        return sRow;
        
    }


    
    
}
