import java.util.Scanner;
class PolymorphismExample
{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class Test
{
public static void main(String args[])
{
PolymorphismExample ob1=new PolymorphismExample();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your name:");
String s=sc.next();
ob1.print(s);
}
}