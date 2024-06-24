class user
{
       String name;
       int rollno;
       int phoneno;
    void userdisplay()
    {
        System.out.println("Name :"+name);
        System.out.println("Roll no :"+rollno);
        System.out.println("Phone no :"+phoneno);
    }
}
class book
{
    String bookname;
    String authorname;
    String publishday;

    void bookdisplay()
    {
        System.out.println("Book Name :"+bookname);
        System.out.println("Author Name :"+authorname);
        System.out.println("Publishday:"+publishday);
    }
}
 class app
 {
public static void main(String[] args)
    {
        user ob= new user();
        ob.name="jeba";
        ob.rollno=21211;
        ob.phoneno=312564;
        ob.userdisplay();
        book ob1=new book();
        ob1.bookname="The power of Your Sub-consis mind";
        ob1.authorname="DEVID GOGGIN";
        ob1.publishday="15-12-2004";
        ob1.bookdisplay();
    }
}