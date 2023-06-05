import java.util.Scanner;
class For509
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
k=i*k;
}
System.out.println("Factorial "+n+" number is: "+k);
}
}
