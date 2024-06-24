
class jeba
{
     static jeba ob=null;
     private jeba(){}
     public static jeba calis()
     {
         if(ob==null)
           ob= new jeba();
        return ob;
     }
     void dispaly()
     {
        System.out.println("I am the KING of Demon ");
     }
}

class singleton
{
    public static void main(String[] args)
    {
        jeba o=jeba.calis();
        o.dispaly();
    }
}