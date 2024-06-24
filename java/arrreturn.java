import java.util.Scanner;
import java.util.Arrays;
class arrreturn
{
   public static void main(String[] args)
   {
    method o=new method();
    int my[]=o.retu();
    for(int a:my)
    {
        System.out.println(a);
    }
   } 
}
class method
{
       public int[] retu(){
        
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the limit : ");
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
          {
           System.out.println("Enter the value "+i+" :");
           arr[i]=ob.nextInt();
          }
        Arrays.sort(arr);
      return arr;
}
}
