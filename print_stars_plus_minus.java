import java.util.Scanner;
class print_stars_plus_minus
{
public static void print_multiple_chars(int i,char c)
{
int k=0;
for(k=1;k<=i;k++)
System.out.print(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
print_multiple_chars(j,'*');
print_multiple_chars(j+1,'+');
print_multiple_chars(j+2,'-');
}
}