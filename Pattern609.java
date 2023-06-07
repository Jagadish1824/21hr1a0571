import java.util.Scanner;
class Pattern609
{
public static void print_pattern_chars(int i,char c)
{
for(int k=1;k<=(i/2);k++)
{
for(int n=1;n<=k;n++)
{
System.out.print(c);
}
System.out.println();
}
}
public static void print_pattern(int n,char ch2)
{
for(int x=(n-(n/2));x>=1;x--)
{
for(int y=x;y>=1;y--)
{
System.out.print(ch2);
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter How many times you want to print:");
int j=sc.nextInt();
System.out.println("Enter a character to print:");
char ch=sc.next().charAt(0);
print_pattern_chars(j,ch);
print_pattern(j,ch);
}
}