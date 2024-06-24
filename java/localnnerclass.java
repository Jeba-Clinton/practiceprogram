class out
{
  void dispaly()
  {
     class inn
     {
        void inndispaly()
        {
            System.out.println("Jeba the calisthenics KING !!!");
        }
     }
     inn i=new inn();
     i.inndispaly();
  }
}
class localnnerclass
{
    public static void main(String[] args)
    {
        out i=new out();
        i.dispaly();
    }
}