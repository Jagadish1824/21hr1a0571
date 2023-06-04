import java.util.Scanner;
class Program404
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
String str="";
for(int i=0;i<=num1;i=i+num2)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
{
System.out.print(str.charAt(i));
}
}
}
