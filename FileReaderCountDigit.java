import java.io.*;
class FileReaderCountDigit
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigit=0;
while((i=br.read())!=-1)
{
if(((char)i>='0')&&((char)i<='9'))
countDigit++;
}
System.out.println(countDigit);
br.close();
fr.close();
}
}