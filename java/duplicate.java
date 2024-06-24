class duplicate
{
    public static void main(String[] args)
    {
        int[] a=new int[]{2,3,2,5,6,6,9,5,7,7,9};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]==a[j])&&(i!=j))
                {
                    System.out.println("Duplicate element is: "+a[j]);
                }
            }
        }
    }
}