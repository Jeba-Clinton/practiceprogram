import java.util.Scanner;
class Bintodec
{
    public static void main(String[] args)
    {
        System.out.println("101101 - decimal value is : "+decimal(101101));
    }
    public static int decimal(int bin)
    {
        int power=0,decimal=0,rem;
        for(int i=0;bin!=0;i++)
        {
           rem=bin%10;
           decimal += rem*Math.pow(2,i);
           bin=bin/10;
        }
        return decimal;
    }
}