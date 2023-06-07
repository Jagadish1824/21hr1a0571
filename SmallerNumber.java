import java.util.Scanner;
class SmallerNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a<b)&&(a<c))
{
System.out.print(a+" is smaller");
}
else if((b<a)&&b<c)
{
System.out.println(b+" is smaller");
}
else if((c<a)&&(c<b))
{
System.out.println(c+" is smaller");
}
else
{
System.out.println("All are equal");
}
}
}