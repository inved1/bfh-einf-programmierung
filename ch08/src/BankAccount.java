public class BankAccount implements Measurable
{  
	private double balance;

	public BankAccount()
	{   
		balance = 0;
	}

	public BankAccount(double initialBalance)
	{   
		balance = initialBalance;
	}

	public void deposit(double amount)
	{  
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public void withdraw(double amount)
	{   
		double newBalance = balance - amount;
		balance = newBalance;
	}

	public double getBalance()
	{   
		return balance;
	}

	public double getMeasure()
	{
		return balance;
	}
}