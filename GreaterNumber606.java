import java.util.Scanner;
class GreaterNumber606
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.print(a+" is Greater");
}
else if((b>a)&&(b>c))
{
System.out.println(b+" is Greater");
}
else if((c>a)&&(c>b))
{
System.out.println(c+" is Greater");
}
else
{
System.out.println("All are equal");
}
}
}