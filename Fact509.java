import java.util.Scanner;
class Fact509
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any positive Integer");
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=i*fact;
}
System.out.println("Factorial "+n+" number is: "+fact);
}
}
