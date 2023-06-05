import java.util.Scanner;
class Program510
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base number:");
int n=sc.nextInt();
System.out.println("Enter the power:");
int j=sc.nextInt();
int k=1;
for(int i=1;i<=j;i++)
{
k *=n;
}
System.out.println("Result is "+k);

}
}

