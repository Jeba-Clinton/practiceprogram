import java.util.Arrays;
class eleinsert{
    public static void main(String[] args)
    {
        int a[]=new int[]{10,7,8,9,22,42,65,200};
        int index=4,value=333;
        System.out.println("Before insert: "+Arrays.toString(a) );
        for(int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After insert: "+Arrays.toString(a) );
    }
}