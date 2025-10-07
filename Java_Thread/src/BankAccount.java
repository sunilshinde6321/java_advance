
public class BankAccount {

	private int balance = 10000;
	
	public synchronized void deposit(int amount , String threadname)
	{
		
		balance  += amount;
		System.out.println(threadname + " deposited "+ amount + " Curreny balance "+balance);
		
	}
	
	public synchronized void  withdraw(int amount , String threadName)
	{
		
		
		if(balance >=amount)
		{
			balance -=amount;
			System.out.println(threadName + " withdraw "+amount + " curret balance"+balance);
		}
		else
		{
			System.out.println(threadName + " tried to withdraw ₹" + amount + " but insufficient balance!");
		}
	}
	
	
	public int getBalance()
	{
		return balance;
	}
		
	
}
