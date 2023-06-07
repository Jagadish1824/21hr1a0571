class C
{
public void disp()
{
System.out.println("Method of class C");
}
}
class A extends C
{
public void disp()
{
System.out.println("Method of class A");
}
}
class B extends C
{
public void disp()
{
System.out.println("Method of class B");
}
}
class TestInheritance4
{
public static void main(String args[])
{
B b=new B();
b.disp();
A a=new A();
a.disp();
C c=new C();
c.disp();
}
}
