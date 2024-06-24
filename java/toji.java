import java.awt.*;

public class myFrame extends Frame
{
    Checkbox ckb;

    public myFrame()
    {
        setSize(300,300);
        setTitle("MY Frame");
        setLayout(null);
        
        ckb=new Checkbox("Select Me!");
        add(ckb);
    }
}

class toji
{
    public static void main(String[] args)
    {
        myFrame f=new myFrame();
    }
}