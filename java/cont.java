class Student
{
   int rollno;
   String name;
   public Student(int r,String n)
   {
      rollno=r;
      name=n;
   }
    
   void StudentDispaly()
   {
    System.out.println("Student Name : "+name);
    System.out.println("Student Roll-no : "+rollno);
    System.out.println("----------------------------");
   }

}

class cont
{
    public static void main(String[] args)
    {
        Student[] ob= new Student[6];
        ob[0]= new Student(10,"jeba");
        ob[1]= new Student(20,"jeya");
        ob[2]= new Student(30,"God");
        ob[3]= new Student(40,"Sin");
        ob[4]= new Student(50,"Evil");
        for(int i=0;i<ob.length;i++)
        {
        ob[i].StudentDispaly();
        }
    }
}