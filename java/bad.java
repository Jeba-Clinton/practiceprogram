import java.awt.*;
class man extends Frame
{
   Label l1;
   public man()
   {
     super("Calisthenics");
     setSize(1000,600);
     setLayout(null);
     setVisible(true);
     l1=new Label("OPtion 1");
     add(l1);
   }
}

class bad
{
    public static void main(String[] args)
    {
        man i=new man();
    }
}