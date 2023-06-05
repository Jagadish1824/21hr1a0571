import java.util.Scanner;
class Program504
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(i>j)
{
System.out.println(i+" is max");
System.out.println(j+" is min");
}
else if(i<j)
{
System.out.println(j+" is max");
System.out.println(i+" is min");
}
else
{
System.out.println("Both are Equal");
}
}
}