class First1 implements Runnable
{
Thread t;
First();
t=new Thread(this,"NEW");
System.out.println("Child:"+t);
t.start();
}
public void run()
{
try
{
for(int 5;i>0;;i--)
{
System.out.println("CHILD :"+i)
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
}
System.out.println("EXITING CHILD");
}
}