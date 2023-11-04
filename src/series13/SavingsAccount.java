package series13;

public class SavingsAccount extends BankAccount{

	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
    public double addInterest(double interestRate)
    {
    	double balanceAfterIntereset = getBalance() + (getBalance() * interestRate); 
    	return balanceAfterIntereset;
    }
}
