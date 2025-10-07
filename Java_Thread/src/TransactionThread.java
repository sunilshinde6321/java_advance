
public class TransactionThread  extends Thread
{
 
	
	 private BankAccount account;
	 private boolean isDeposit;
	 private int amount;
	 
	 public TransactionThread(BankAccount account, boolean isDeposit, int amount, String name) 
	 {
		 super(name);
		 this.account = account;
		 this.isDeposit = isDeposit;
		 this.amount = amount;
	 }
	 
	 
	 public void run()
	 {
		 for (int i = 1; i <= 3; i++) {
	            if (isDeposit)
	                account.deposit(amount, getName());
	            else
	                account.withdraw(amount, getName());

	            try {
	                Thread.sleep(500); // simulate processing delay
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	 }
}
