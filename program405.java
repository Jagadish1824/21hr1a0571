import java.util.Scanner;
class Program405
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();
num2=sc.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.print(num1+" ");
System.out.print(num2);
}
}