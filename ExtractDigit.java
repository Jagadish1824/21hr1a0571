import java.util.Scanner;
class ExtractDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String r=sc.next();
char ch=sc.next().charAt(0);
for(int i=0;i<=r.length()-1;i++)
{
if(r.charAt(i)>='a' && r.charAt(i)<='z')
{
if(ch!=r.charAt(i))
{
System.out.print(r.charAt(i));
}
}
}
}
}