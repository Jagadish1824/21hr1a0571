import java.util.Scanner;
class For508
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=0;
for(int i=1;i<=n;i++)
{
k=i+k;
}
System.out.println("sum of first "+n+" numbers is: "+k);
}
}
