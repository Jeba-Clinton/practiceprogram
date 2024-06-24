class out
{
    static int a=20;
    static class inner 
    {
        int b=10;
        void innerdisplay()
        {
           System.out.println("A value :"+a);
           System.out.println("B value :"+b);
        }
    }
    void outdisplay()
        {
           inner i= new inner();
           i.innerdisplay();
           System.out.println("B in inner class  : "+i.b);
        }
}

 
class innerclass 
{
    public static void main(String[] args)
    {
        out.inner o=new out.inner();
        o.innerdisplay();
        out i=new out();
        i.outdisplay();
    }
}