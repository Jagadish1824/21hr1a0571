class Student7
{
int id;
String name;
int age;
Student7(int i,String n)
{
id=i;
name=n;
}
Student7(int  i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
Student7 s1=new Student7(111,"Jagadish");
Student7 s2=new Student7(222,"Smarty",99);
s1.display();
s2.display();
}
}