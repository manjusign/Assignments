package series13;

public class Assignment2 {
	public static void main(String[] args)
	{
		SavingsAccount s1 = new SavingsAccount("AC001", 1000);
		CurrentAccount c1 = new CurrentAccount("AC002", 1000);
//		s1.addInterest(40);
//		c1.overDraft(100);
		System.out.println("Savings Account : \n"+ "Balance after interest : " + s1.addInterest(0.05));
		System.out.println();
		System.out.println("Current Account : \n"+ "Balance After withdrwal with overdraft : " + c1.overDraft(100)));
	}
}
