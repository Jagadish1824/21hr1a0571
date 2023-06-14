class MyThread extends Thread
{
public void run()
{
System.out.println("Shut down hook task completed");
}
}
class TestShutdown1
{
public static void main(String args[])throws Exception
{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new MyThread());
System.out.println("Now main sleeping....please ctrl+c to exit");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
}
}
}