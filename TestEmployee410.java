class Employee
{
int id;
String name;
float salary;
void insertRecord(int r,String n,float s)
{
id=r;
name=n;
salary=s;
}
void display()
{
System.out.println(id+" "+name+" "+salary);
}
}
class TestEmployee410
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"Jagadish",50000);
e1.display();
e2.insertRecord(222,"smarty",75000);
e2.display();
e3.insertRecord(333,"Mounish",95000);
e3.display();
}
}