class AddA
{
public static void main(String args[])
{
int sum=0;
for(String i:args)

sum+=Integer.parseInt(i);
System.out.println(sum);
}
}