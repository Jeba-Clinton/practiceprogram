class sumofdigit
{
    static int digit(int n)
    {
        int re,sum=0;
        while(n!=0)
        {
           re=n%10;
           sum=sum+re;
           n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("The Sum of digit is :"+digit(14512003));
    }
}