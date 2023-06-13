import java.io.*;
import java.util.*;
class Test
{
static boolean isNumber(String s)//Return true if s is a number else false
{
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
{
return false;
}
}//for
return true;
}//isNumber
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
//Function returns 1 if all elements are in range'0-9'
if(isNumber(str))
System.out.println("Integer");
//Function return 0 if the input is not an integer
else
System.out.println("String");
}
}