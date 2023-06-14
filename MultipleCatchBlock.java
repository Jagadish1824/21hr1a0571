public class MultipleCatchBlock
{
public static void main(String args[])
{
try
{
int a[]=new int[5];
a[5]=30/0;//
a[5]=30/2;
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
catch(Exception e)
{
System.out.println("parent Exception occurs");
}
System.out.println("Rest of the code");
}
}
