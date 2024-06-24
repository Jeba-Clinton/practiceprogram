import java.util.Arrays;
class secondbig
{
    public static void main(String[] args)
    {
        int first=0,second=0;
        int[] a=new int[]{10,20,40,11,44,89,59};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    first=a[i];
                }
                else{
                    first=a[j];
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    if(first>a[i])
                    {
                        second=a[i];
                    }
                }
                else{
                    if(first>a[i])
                    {
                        second=a[j];
                    }                   
                }
            }
        }
        System.out.println("The array value is: "+Arrays.toString(a));
        System.out.println("First big value is: "+first);
        System.out.println("Second big value is: "+second);
    }
}