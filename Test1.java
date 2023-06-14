class Customer
{
int amount=10000;
synchronized void withdraw(int amount)
{
System.out.println("going to withdraw");
if(this.amount<amount)
{
System.out.println("Less balance:waiting for deposit");
try
{
wait();
}
catch(Exception e)
{
}
}
this.amount-=amount;
System.out.println("Withdraw completed");
}
synchronized void deposit(int amount)
{
System.out.println("Going to deposit");
this.amount+=amount;
System.out.println("Deposit completed");
notify();
}
}
class Test1
{
public static void main(String args[])
{
final Customer c=new Customer();
new Thread()
{
public void run()
{
c.withdraw(150000);
}
}
.start();
new Thread()
{
public void run()
{
c.deposit(100000);
}
}
.start();
}
}