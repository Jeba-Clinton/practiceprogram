import java.awt.*;
import java.awt.event.*;

class dance extends Frame{
    public dance()
    {
         super("Calisthenics");
        //Label le=new Label("Option 1");
        Checkbox checkbox= new Checkbox("KING");
       
       // fr.add(le);
        add(checkbox); 

        setLayout(null);
        setVisible(true);
        setSize(1000,600);

    }
}
class Simple{
    public static void main(String[] args) {
       dance frm= new dance();
    }
}