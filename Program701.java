import java.util.Scanner;
class Program701
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String r=sc.nextLine();
String j=r;
String k="";
r=r.toLowerCase();
int len=r.length()-1;
for(int i=len;i>=0;i--)
{
k=k+r.charAt(i);
}
System.out.println(k);
if(j.equalsIgnoreCase(k))
{
System.out.println("YES");
}
else
{
System.out.print("NO");

}
}
}