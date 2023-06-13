import java.util.Scanner;
class CountFactors
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int len=0,count=0;
	for(int i=1;i<=n;i++)
	{
	  if(n%i==0)
	  {
		  count++;
		  len = len+i;
	     if( i == n)
		   System.out.print(i);
	   else
		 System.out.print(i+",");
	  }
	  
	}
	System.out.println("\nthe count is :"+len);
	if(count == 2)
		System.out.println("PRIME");
	else
		System.out.println("NOT PRIME");
  }
}