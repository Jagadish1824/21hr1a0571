class Cal extends Thread
{
public static void ain(String args[])
{
Cal obj=new Cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Thread inside main are very much helpful ");
}
public void run()
{
System.out.println("Threads from overridden run method are very much useful");
}
}