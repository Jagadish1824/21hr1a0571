import java.util.Scanner;
class PatternDigits3
{
public static void printLine(int start,int stop)
{
for(int i=start;i<=stop;i++)
{
System.out.print(i);
if(i<stop)
System.out.print(",");
}
}
public static void printPattern(int n)
{
int diffRow=1;
for(int i=0;i<n;i+=diffRow)
{
printLine(i,i+diffRow);
System.out.print("\n");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(0,0);
System.out.print("\n");
printLine(1,2);
System.out.print("\n");
printLine(3,5);
System.out.print("\n");
printLine(6,9);
System.out.print("\n");
}
}