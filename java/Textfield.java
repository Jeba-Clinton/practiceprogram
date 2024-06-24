import java.awt.*;

class myFrame extends Frame
{
    TextField tf;

    public myFrame()
    {
        setSize(300,300);
        setTitle("MY Frame");
        setLayout(null);
        setVisible(true);
        
        tf=new TextField();
        tf.setBounds(10,50,250,30);
        add(tf);
    }
}

class Textfield
{
    public static void main(String[] args)
    {
        myFrame f=new myFrame();
    }
}