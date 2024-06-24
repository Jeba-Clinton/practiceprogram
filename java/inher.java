class father 
{
    public void abc()
    {
    System.out.println(" father");
}
}

class son extends father

{
    public void xyz()
    {
    System.out.println("Son");
}
}

class little extends son{
    public void mno()
    {
   System.out.println("Little"); 
}
}

class inher
{
    public static void main(String[] args)
    {
        little ob=new little();
        ob.abc();
        ob.mno();
        ob.xyz();
    }
}