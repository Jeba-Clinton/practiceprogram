class value
{
    int len,bre,dep;
}

class jeba extends value
{
    jeba(int len,int bre)
    {
       this.len=len;
       this.bre=bre;
    }
     
    void jebadis()
    {
        System.out.println(len+bre);
    }
}

class sub extends value{
    sub(int len,int bre,int dep)
    {
        this.len=len;
        this.bre=bre;
        this.dep=dep;
    }
    void subdis()
    {
        System.out.println(len+bre+dep);
    }
}

class heir
{
    public static void main(String[] args)
    {
        sub s=new sub(10,10,10);
        s.subdis();

        jeba j=new jeba(1,7);
        j.jebadis();
    }
}