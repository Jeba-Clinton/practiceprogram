import java.awt.*;
import java.awt.event.*;

class toji extends Frame implements ActionListener
{
    Label L1,L2,L3;
    Button but;
    TextField txt1;
    TextField txt2;
    public toji()
    {
        setTitle("Calis jeba");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        L1 = new Label("Enter the 1 Number :");
        L1.setBounds(10,50,100,30);

        txt1= new TextField();
        txt1.setBounds(150,50,250,30);

        L2 = new Label("Enter the 2 Number :");
        L2.setBounds(10,100,100,30);

        txt2= new TextField();
        txt2.setBounds(150,100,250,30);

        but=new Button("ADD");
        but.setBounds(150,150,100,30);
        but.addActionListener(this);

        L3 = new Label("!!!---------!!!");
        L3.setBounds(10,200,300,30);

        add(L1);
        add(txt1);
        add(L2);
        add(txt2);
        add(L3);
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
           String s2= txt2.getText();
           if(s1.isEmpty() || s2.isEmpty())
           {
              L3.setText("Please Enter the NUMBER");
           }
           else
           {
           int a=Integer.parseInt(s1);
           int b=Integer.parseInt(s2);
           int c=a+b;
           String re=String.valueOf(c);
           L3.setText("value is :"+re);
           }
    }
}

public class Awtadd {
    public static void main(String[] args) {   
    toji to= new toji();
}
}
