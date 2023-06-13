import 	java.util.Scanner;
class Factorial902
{
public static int calculateFactoraial(int n)
{
if(n==0)
return 1;
else 
return n * calculateFactorial(n-1);
return 0;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
if(inputNum<0)
{
System.out.println("INVALID");
}
else
{
System.out.println(calculateFactorial(inputNum));
}
}
}