package series14;

public class Diary1 {
	public String title;
	public String entryDate;
	public String content;
	
	public Diary1(String title, String entryDate, String content) {
		this.title = title;
		this.entryDate = entryDate;
		this.content = content;
	}
	
	public String dispalyEntry()
	{
		return "Title : " + title + "\nEntryDate : " + entryDate + "\ncontent : " + content;
	}
	
}
