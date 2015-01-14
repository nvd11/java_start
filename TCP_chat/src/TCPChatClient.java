import java.io.File;
public class TCPChatClient{
    public static void main(String[] args){
        System.out.printf("Hello\n");
        TCPChatClientForm.newInstance();
        TCPIniReader.readValue("AAA","");
        TCPIniReader.readValue("BBB","");
        TCPIniReader.readValue("AAA","");
        System.out.println("done!");
    }
}
