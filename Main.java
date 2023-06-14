import java.util.*;
class Marks extends Exception
{
String msg;
Marks(String msg)
{
super(msg);
this.msg=msg;
}
//overriding with our custom message
@Override
public String toString()
{
return msg;
}
}
class Main

{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try
{
if(marks<0)
{
//checking if the age is above the limit or not
throw new Marks("Marks should not be negative");
}
}
catch(Marks ex)
{
//calls override toString() method
System.out.println(ex);
//prints message passed to the super constructor
System.out.println(ex.getMessage());
}
}
}