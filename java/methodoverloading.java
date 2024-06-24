class user
{
    String name;
    int age;

    user(String n,int a)
    {
        this.name=n;
        this.age=a;
    }

    void display()
    {
         System.out.println("Name :"+name);
         System.out.println("age :"+age);
    }
}
class method extends user
{
    String c;
      method(String n,int a,String c)
      {
        super(n, a);
        this.c=c;
      }
      void display()
    {
         System.out.println("Name :"+name);
         System.out.println("age :"+age);
         System.out.println("String :"+c);
    }
}

class methodoverloading
{
    public static void main(String[] args)
    {
        method o= new method("jeba",19,"king");
        o.display();
    }
}
