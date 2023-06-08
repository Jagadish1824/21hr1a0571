class Student
{
int rollno;
String name;
static String college="MTIE";
static void change()
{
college="MVR";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod
{
public static void main(String args[])
{
Student s1=new Student(111,"Smarty");
Student s2=new Student(222,"Mounish");
Student s3=new Student(333,"Jagadish");
s1.display();
s2.display();
s3.display();
}
}