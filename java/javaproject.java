import java.util.Arrays;
class javaproject
{
    public static void main(String[] args)
    {
        int[] a=new int[]{10,30,50,70,39,44,58};
        int temp;
        System.out.println("Before array: "+ Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Before array: "+ Arrays.toString(a));
    }
}