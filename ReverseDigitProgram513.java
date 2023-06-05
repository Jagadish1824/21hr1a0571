import java.util.Scanner;
class ReverseDigitProgram513
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int k=0;
while(n>0)
{
k=k*10+(n%10);
n=n/10;
}
System.out.println("Reverse of given number is: "+k);
}
}
