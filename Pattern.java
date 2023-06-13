import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
int n,i,j,space=1;
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
n=sc.nextInt();
space=n-1;
for(j=1;j<=n;j++)
{
for(i=1;i<=space;i++)
{
System.out.print("#");
}
space--;
for(i=1;i<=j;i++)
{
System.out.print(ch);
}
System.out.println("");
}
}
}