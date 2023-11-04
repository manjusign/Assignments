package series13;

public class CurrentAccount extends BankAccount{

	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public double overDraft(double overDraftLimit)
	{
		double result;
		withdraw(overDraftLimit);
//				(-1 * overDraftLimit);
		
		if(overDraftLimit > getBalance()) 
		{
			result = -1 * overDraftLimit;
			//System.out.println(result);
		}
		return overDraftLimit;
	}
}
