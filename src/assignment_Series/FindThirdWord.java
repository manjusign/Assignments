package assignment_Series;

public class FindThirdWord {
	public static void main(String[] args)
	{
		int count = 0;
		String thirdword = "";
		String sentence = "I am getting understanding evrything well,i am proud of it.";
		for(int i = 0; i < sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ')
				count++;
			if(count == 2)
				thirdword +=ch;
		}
		System.out.println(thirdword);
	}

}
