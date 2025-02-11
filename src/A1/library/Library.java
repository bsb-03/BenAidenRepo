package A1.library;

public class Library {
	private int[5] Book;
	private int count;
	
	public boolean addBook(Book book){
		int i=0;
		for(i=0; i<=5;i++)
		{
			if(Book[i] == null)
				break;
		}
		if(i==5)
			System.out.println("Your library is full!");
		Book[i] = new Book;
		count++;
	}
	
}
