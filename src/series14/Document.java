package series14;

public class Document implements Readable,Writable
{
	public void write() 
	{
		System.out.println("Reading the document");
	}

	public void read() 
	{
		System.out.println("Writing the document");
	}

}
