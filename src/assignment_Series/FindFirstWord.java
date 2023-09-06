package assignment_Series;

public class FindFirstWord {
	public static void main(String[] args)
	{
		String firstword = "";
		int count = 0;
		String sentence = " Manju is the best.";
		for(int i = 0; i< sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ')
				count++;
			if(count == 1)
			firstword += ch;
		}
		System.out.println(firstword);
	}

}
