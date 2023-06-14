import java.util.Scanner;
class PatternDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
for(int a=1;a<=i;a++)
{
for(int b=1;b<=a;b++)
{
System.out.print(b);
}
System.out.println(" ");
}
}
}