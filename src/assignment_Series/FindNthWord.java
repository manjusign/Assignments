package assignment_Series;

public class FindNthWord {
	public static void main(String[] args)
	{
		int count = 0;
		int n = 11;
		String nthword = "";
		String sentence = "I am on the right way.Universe always guides me,thank you.";
		for(int i = 0; i <sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ' || ch == '.' || ch == ',')
				count++;
			else if(count == n-1)
				nthword += ch;		
		}
		System.out.println(nthword);
	}
}
