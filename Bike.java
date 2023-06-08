class Bike
{
final int speedlimit=90;
void run()
{
speedlimit=400;
System.out.println(speedlimit);
}
public static void main(String args[])
{
Bike obj=new Bike();
obj.run();
}
}