import java.awt.*;
import java.awt.event.*;
class Myapp extends Frame implements ActionListener
{
    Button bt;
    Label l1;
    public Myapp()
    {
        super("Calisthenics");
        setSize(500,300);
        setLayout(null);

        bt=new Button("Click Here");
        bt.setBounds(75, 75, 100, 20);
        bt.addActionListener(this);
        add(bt);
        setVisible(true);

        l1= new Label("KING  -----");
        l1.setBounds(75, 150, 100, 20);
        add(l1);
       
       this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
         {
            System.exit(0);
         }
       });

    }
        public void actionPerformed(ActionEvent e)
        {
            l1.setText("BUTTON CLICKED");
        }
    
}
public class Framer {
    public static void main(String[] args)
    {
       Myapp fr= new Myapp();
    }
}
