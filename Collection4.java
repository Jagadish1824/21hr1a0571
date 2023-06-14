import java.util.ArrayList;
class Collection4
{
public static void main(String args[])
{
ArrayList<String>animals=new ArrayList<>();
animals.add("cat");
animals.add("dog");
animals.add("cow");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals)
{
System.out.print(temp);
System.out.print(",");
}
}
}
