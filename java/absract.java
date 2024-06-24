abstract class mobile
{
    void voicecall()
    {
        System.out.println("Voice call !!!!");
    }
    abstract void camera();
    abstract void display();
}

class sumsung extends mobile
{
    void camera()
    {
        System.out.println("8 pixel camera!!!!");
    }
    void display()
    {
        System.out.println("14.5 inch camera!!!!");
    }
}

class vivo extends mobile{
    void camera()
    {
        System.out.println("14 pixel camera!!!!");
    }
    void display()
    {
        System.out.println("18.5 inch camera!!!!");
    }
    void finger()
    {
        System.out.println("HIGH fast sensor!!!");
    }
}

class absract
{
    public static void main(String[] args)
    {
    vivo v11= new vivo();
    v11.camera();
    v11.display();
    v11.finger();
    System.out.println("-----------------------");

    sumsung m34 = new sumsung();
    m34.camera();
    m34.display();
}
}
