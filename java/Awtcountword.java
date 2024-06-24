import java.awt.*;
import java.awt.event.*;

class tojiApp extends Frame implements ActionListener
{
    Label L1,L2;
    TextArea ta;
    Button but;
   public tojiApp()
   {
      setTitle("Count word and charactors");
      setSize(1000,600);
      setLayout(null);
      setVisible(true);

      L1=new Label("______________");
      L1.setBounds(20,30,200,20);

      L2=new Label("______________");
      L2.setBounds(20,60,300,20);
      
      ta=new TextArea();
      ta.setBounds(20,100,300,200);

      but=new Button("GET DETAILS");
      but.setBounds(20,320,100,30);
      but.addActionListener(this);

      add(L1);
      add(L2);
      add(ta);
      add(but);

      this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
      });
   }

   public void actionPerformed(ActionEvent we)
   {
      String text=ta.getText();
      String word[]=text.split("\\s");
      L1.setText("Word length :"+word.length);
      L2.setText("charactors is : "+text.length());
   }
}



public class Awtcountword {
    public static void main(String[] args) {
        tojiApp to= new tojiApp();
    }
}
