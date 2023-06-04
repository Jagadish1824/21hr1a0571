class Student
{
int rollno;
String name;
Student()
{
rollno=0;
name=null;
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent409e
{
public static void main(String args[])
{
Student s1;
s1=new Student(222,"Smarty");
Student s2=new Student(111,"Jagadish");
s1.displayInformation();
s2.displayInformation();
}
}