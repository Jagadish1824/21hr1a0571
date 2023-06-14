class Animal
{
public void move()
{
System.out.println("This is Animal class");
}
}
class Pet extends Animal
{
public void move()
{
System.out.println("This is pet class");
}
}
class Wild extends Animal
{
public void move()
{
System.out.println("This is wild class");
}
}
class TestDog
{
public static void main(String args[])
{
Animal a=new Animal();//animal reference and object
Animal b=new Pet();//Animal reference but Dog object
Animal c=new Wild();
a.move();//runs the method in An
b.move();
c.move();
}
}