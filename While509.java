import java.util.Scanner;
class While509
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0;
while(i<=num)
{
System.out.print(i);
if(i<num)
{
System.out.print(",");
}
i++;
}
}
}