import java.util.Scanner;
class Program702
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String r=sc.nextLine();
for(int i=0;i<=r.length();i++)
{
if(r.charAt(i)>='0'&& r.charAt(i)<='9')
{
System.out.print(r.charAt(i));
}
}
}
}