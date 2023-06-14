import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int a=0;
int b=1;
System.out.println("Enter nth term");
int n=sc.nextInt();
System.out.println("Fibonacci series");
while(sum<=n)
{
System.out.print(sum+" ");
a=b;//swap elements
b=sum;
sum=a+b;
}
}
}