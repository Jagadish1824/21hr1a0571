import java.util.Scanner;
class ReverseStringPalindrome515
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String n=sc.next();
String k="";
int len=n.length()-1;
String t=n;
for(int i=len;i>=0;i--)
{
k=k+n.charAt(i);
}
System.out.println(k);
if(t.equals(k))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}
