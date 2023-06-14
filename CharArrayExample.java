import java.io.CharArrayReader;
public class CharArrayExample
{
public static void main(String args[])throws Exception
{
char ary[]={'j','a','v','a','p','o','i','n','t'};
CharArrayReader reader=new CharArrayReader(ary);
int k=0;
while((k=reader.read())!=-1)
{
char ch=(char)k;
System.out.println(ch+":");
System.out.println(k);
}
}
}