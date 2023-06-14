import java.util.Scanner;
class PatternDiamond1002
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPatternU(ch,row);
}
public static void printPatternU(char c,int n)
{
for(int i=n/2,j=1;j<=n;i--,j+=2)
printLine(c,i,j);
}
public static void printLine(char c,int nch1,int nch2)
{
System.out.print("\n");
char ch='#';
for(int i=0;i<nch1;i++)
System.out.print(ch);
for(int i=0;i<nch2;i++)
System.out.print(c);
for(int i=0;i<nch1;i++)
System.out.print(ch);
}
}
