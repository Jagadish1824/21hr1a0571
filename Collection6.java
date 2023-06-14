import java.util.Iterator;
import java.util.Vector;
class Collection6
{
public static void main(String args[])
{
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Horse");
animals.add("Cat");
String element=animals.get(2);
System.out.println("Element at index 2:"+element);
Iterator<String>iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext())
{
System.out.print(iterate.next());
System.out.print(",");
}
}
}