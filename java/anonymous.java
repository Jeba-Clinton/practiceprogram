abstract class demo
{
    abstract void dispaly();
}
class realdemo
{
    public void realdemodis()
    { 
        demo i= new demo(){
                       void dispaly()
                            {
                                 System.out.println("Jeba calisthenics Master");
                              }
                         };
        i.dispaly();
    }

}


class anonymous 
{
    public static void main(String[] args)
    {
        realdemo i= new realdemo();
        i.realdemodis();
    }
}