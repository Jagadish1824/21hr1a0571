import java.io.*;
class FileReaderCountVowel
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1)
{
if(((char)i=='a')||((char)i=='e')||((char)i=='i')||((char)i=='o')||((char)i=='u')||((char)i=='A')||((char)i=='E')||((char)i=='I')||((char)i=='O')||((char)i=='U'))
countVowel++;
}
System.out.println(countVowel);
br.close();
fr.close();
}
}