class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class Student10
{
public static void main(String args[])
{
Student s=new Student(111,"Jagadish",200000);
s.display();
}
}