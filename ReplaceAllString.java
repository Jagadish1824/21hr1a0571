import java.util.Scanner;
class ReplaceAllString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String inputstr=sc.nextLine();
String c=sc.next();
String r=sc.next();
String res=inputstr.replaceAll(c,r);
System.out.print(res);
}
}