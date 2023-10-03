package series9;

import java.util.Scanner;

public class NumberOfWords {
	private static String numberOfwordsInSentence(String word)
	{
		int count = 0;
		for(int i = 0;i < word.length(); i++)
		{
			char ch = word.charAt(i);
			if(ch == ' ' || ch == '.' || ch == ',')
			{
				count++;
			}
		}
		System.out.println("number of words is " + count);
		return word;
		
	}
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();
		numberOfwordsInSentence(sentence);
		
	}
	
}
