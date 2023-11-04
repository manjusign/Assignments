package series13;

public class Assignment1 extends BankAccount{
	public Assignment1(String accountNumber, double balance) 
	{
		super(accountNumber, balance);
	}
	public static void main(String[] args)
	{
		BankAccount a1 = new BankAccount("ACC1001", 50000);
		System.out.println("Account Number : " + a1.getAccountNumber());
		a1.deposit(25000);
		a1.withdraw(20000);
	}
}
