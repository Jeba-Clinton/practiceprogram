import java.awt.*;
import java.awt.event.*;

class toji extends Frame implements ActionListener
{
    Label L1,L2;
    Button but;
    TextField txt1;
    public toji()
    {
        setTitle("Calis jeba");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        L1 = new Label("Enter the total no.of count :");
        L1.setBounds(10,50,100,30);

        txt1= new TextField();
        txt1.setBounds(150,50,250,30);

        but=new Button("Convert!");
        but.setBounds(150,150,100,30);
        but.addActionListener(this);

        L2 = new Label("!!!---------!!!");
        L2.setBounds(10,200,300,30);

        add(L1);
        add(txt1);
        add(L2);
        add(but);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
           String s1= txt1.getText();
           if(s1.isEmpty())
           {
              L2.setText("Please Enter the NUMBER");
           }
           else
           {
           String r[]= new String[10];
           int n1=0,n2=1,n3=0,temp=0;
          for(int i=2;i<Integer.parseInt(s1);i++)
           {
              n3=n1+n2;
              r[i]=String.valueOf(n3);
              temp=n2;
              n2=n3;
              n1=temp;
           }
           String data="0 1";
           for(int i=2;i<Integer.parseInt(s1);i++)
           {
              data += r[i]+" ";
           }
           L2.setText(data);
           } 
    }
}

public class Awtfebnocis {
    public static void main(String[] args) {   
    toji to= new toji();
}
}
