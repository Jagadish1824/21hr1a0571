import java.util.Scanner;
class PrintPattern4
{
static int x=0;
public static void printPattern(int n)
{
for(int i=0;x<=n;i++)
{
printLine(i);
System.out.println();
}
}
public static void printLine(int stop)
{
for(int i=0;i<=stop;i++)
{
System.out.print(x++);
if(i<stop)
System.out.print(",");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPattern(n);
}
}