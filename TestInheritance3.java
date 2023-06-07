class Animal
{
void eat()
{
System.out.println("Eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Barking");
}
}
class Cat extends Animal
{
void meow()
{
System.out.println("Sleeping");
}
}
class TestInheritance3
{
public static void main(String args[])
{
Cat d=new Cat();
d.meow();
d.eat();
Dog c=new Dog();
c.bark();
}
}