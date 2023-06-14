class TestInterruptingThread2 extends Thread
{
public void run()
{
try
{
Thread.sleep(1000);
System.out.println("Task");
}
catch(InterruptedException e)
{
System.out.println("Exception handled"+e);
}
System.out.println("Thread is running");
}
public static void main(String args[])
{
TestInterruptingThread2 t1=new TestInterruptingThread2();
t1.start();
t1.interrupt();
}
}