class TestShutdown2
{
public static void main(String args[])throws Exception
{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new Thread()
{
public void run()
{
System.out.println("Shut down hook task is completed..");
}
}
);
System.out.println("Now main sleeping..press ctrl+c to exist");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
}
}
}
