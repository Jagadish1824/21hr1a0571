import java.util.Scanner;
class Program703
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String r=sc.nextLine();
String j=r;
String k="";
int len=r.length()-1;
for(int i=len;i>=0;i--)
{
k=k+r.charAt(i);
if(((r.charAt(i)<='a')||(r.charAt(i)>='z'))||((r.charAt(i)<='A')||(r.charAt(i)>='Z')))
{
k=k+r.charAt(i);
System.out.println("YES");
}
else
{
System.out.print("NO");
}
}
}
}