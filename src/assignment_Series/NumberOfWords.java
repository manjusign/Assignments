package assignment_Series;

public class NumberOfStrings {
	public static void main(String[] args)
	{
		int n;
		int count = 0;
		String sentence = "i am growing and developping,skills related to coding.manju is always good girl.";
		for(int i = 0; i <sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ' || ch == '.' || ch ==',') 
			count++;
		}
		System.out.println(count);
	}

}
