import java.util.Scanner;
class SimpleInterest901
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
float y=sc.nextFloat();
float z=sc.nextFloat();
float r=(x*y*z)/100;
if(r==(int)r)
{
int a=(int)r;
System.out.println(a);
}
else{
System.out.println(r);
}
}
}