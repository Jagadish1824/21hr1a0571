class Student
{
int rollno;//instance variable
String name;
static String college="MTIE";//stataic variable
Student(int r,String n)//constructor
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class StaticVariable
{
public static void main(String args[])
{
Student s1=new Student(111,"Jagadish");
Student s2=new Student(222,"Smarty");
//we can change the college of all objects by the single line of code
Student.college="MVR";
s1.display();
s2.display();
}
}
