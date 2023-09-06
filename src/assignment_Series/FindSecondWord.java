package assignment_Series;

public class FindSecondWord {
	public static void main(String[] args)
	{
		int count = 0;
		String secondword = "";
		String sentence = "Everything always works out";
		for(int i = 0; i < sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ')
				count++;
			if(count == 1)
				secondword += ch;
		}
		System.out.println(secondword);
	}

}
