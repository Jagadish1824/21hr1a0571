class Student9
{
int rollno;
String name,course;
float fee;
Student9(int rollno,String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student9(int rollno,String name,String course,float fee)
{

this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis9
{
public static void main(String args[])
{
Student9 s1=new Student9(111,"Jagadish","java");
Student9 s2=new Student9(222,"Smarty","java",6000f);
s1.display();
s2.display();
}
}