class Student8
{
int id;
String name;
Student8(int i,String n)
{
id=i;
name=n;
}
Student8(Student8 s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student8 s1=new Student8(111,"Jagadish");
Student8 s2=new Student8(s1);
s1.display();
s2.display();
}
}