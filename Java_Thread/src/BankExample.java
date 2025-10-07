
public class BankExample {

	
	
	public static void main(String[] args) 
	{
		
		
		BankAccount account = new BankAccount();
		
		
        TransactionThread t1 = new TransactionThread(account, true, 200, "Depositor-1");
        
        TransactionThread t2 = new TransactionThread(account, false, 300, "Withdrawer-1");
        
        TransactionThread t3 = new TransactionThread(account, true, 100, "Depositor-2");
        

				
        t1.start();
        t2.start();
        t3.start();
	}
}
