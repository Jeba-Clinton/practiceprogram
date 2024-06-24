class Student
{
   int rollno;
   String name;
   int percen;

   void Student(int per,int roll,String n)
   {
      System.out.println("Construtor Called");
      percen=per;
      rollno=roll;
      name=n;
   }
    
   void StudentDispaly()
   {
    System.out.println("Student Name : "+name);
    System.out.println("Student Roll-no : "+rollno);
    System.out.println("Student Percentage : "+percen);
   }

}

class cont
{
    public static void main(String[] args)
    {
        Student ob=new Student(98,21211,Jebaclinton);
        StudentDispaly();
    }
}