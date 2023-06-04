import java.util.Scanner;
class Program403
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int j=sc.nextInt();

for(int i=0;i<=num;i=i+j)
{
System.out.print(+i);
if(i<num)
{
if(i==15)
{
break;
}
System.out.print(",");
}
}
}
}
