class TryCatchExample1
{
public static void main(String args[])
{
try
{
int data1=50/0;
}
catch(Exception e)
{
int data2=50/0;
}
System.out.println("Rest of the code....");
}
}