public class MultipleCatchBlock3
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println(s.length());
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
System.out.println("Parent Exception occurs");
}
System.out.println("Rest of the code...");
}
}