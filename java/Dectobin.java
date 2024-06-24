import java.util.Scanner;
class Dectobin
{
    public static int binary(int va)
    {
        int arr[]= new int[100];
        int i;
        for(i=0;va>0;i++)
        {
            arr[i]=va%2;
            va=va/2;
        } 
        for(int j=i-1;j>=0;j--)
        {
           System.out.print(arr[j]);
        }
      return 0;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the Decimal Value : ");
        n=ob.nextInt();
        System.out.print("Binary Value :");
        binary(n);
    }
}