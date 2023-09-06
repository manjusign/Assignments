package assignment_Series;

public class NumberOfSentences {
	public static void main(String[] args)
	{
		int count = 0;
		int sentenceCount = 0;
		String sentence = "manju is loving her life.She got ebrything she want.She is happy with her life.";
		for(int i = 0; i < sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == '.')
				sentenceCount++;
		}
		System.out.println(sentenceCount);
	}

}
