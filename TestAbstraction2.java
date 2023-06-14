abstract class Bike
{
Bike()
{
System.out.println("Bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("Gear changed");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("Running safely");
}
}
class TestAbstraction2
{
public static void main(String args[])
{
Bike obj=new Honda();
obj.run();
obj.changeGear();
}
}