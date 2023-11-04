package series13;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  void deposit(double amount)
	{
		double result = balance + amount;
		System.out.println("Balance after deposit : " + result);
		//return amount;
	}
	public  void withdraw(double amount) 
	{
		double totalAmount = balance - amount;
		System.out.println("Balance after withdraw : " + totalAmount);
		//return amount;
	}
}
