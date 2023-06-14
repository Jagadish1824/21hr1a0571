public class JavaExceptionExample
{
public static void main(String args[])
{
try
{
int data=100/0;
int p=20;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("Rest of the code...");
}
}