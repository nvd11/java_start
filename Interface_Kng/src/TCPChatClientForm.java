import java.awt.*;


public class TCPChatClientForm{
    private Frame fForm = null;
    private TextArea taChat = null;
    private Button btOK = null; 

    //forbid new an instance directly
    private TCPChatClientForm(){

    }

    public static void newInstance(){
        TCPChatClientForm tForm = new TCPChatClientForm();
        tForm.createUI();
    }

    private void createUI(){
        this.fForm = new Frame("Chat Client");
        this.taChat = new TextArea();
        this.btOK = new Button();

        Panel p= new Panel(new BorderLayout());

        fForm.add(taChat,BorderLayout.CENTER); 
        fForm.add(p,BorderLayout.SOUTH);

        fForm.setLocation(300,200);
        fForm.setSize(400,400);
        fForm.setVisible(true);
    } 
}
