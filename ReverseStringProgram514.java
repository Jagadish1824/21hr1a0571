import java.util.Scanner;
class ReverseStringProgram514
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String n=sc.next();
String k="";
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
k=k+n.charAt(i);
}
System.out.println(k);
}
}
