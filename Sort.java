import java.util.*;
class Sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sum=0,i=0,j=0,temp=0;
int a[]=new int[x];
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[x-1]);
for(int y:a)
{
sum+=y;
}
float avg=(float)sum/x;
System.out.println(sum);
System.out.println(avg);
}
}
