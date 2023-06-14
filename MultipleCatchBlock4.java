public class MultipleCatchBlock4
{
public static void main(String args[])
{
try
{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e)
{
System.out.println("common task completed");
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}

System.out.println("Rest of the code...");
}
}