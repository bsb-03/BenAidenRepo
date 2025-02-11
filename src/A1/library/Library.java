package A1.library;
import A1.book.Book;

public class Library {
	private Book[] bookArray = new Book[5];
	private int count;
	
	public boolean addBook(Book book){
		int i=0;
		for(i=0; i<=5;i++)
		{
			if(bookArray[i] == null)
				break;
		}
		if(i==5) {
			System.out.println("Your library is full!");
			return false;
		}
		bookArray[i] = book;
		count++;
		return true;
	}
	
	public boolean removeBook(Book book) {
		int i=0;
		for(i=0;i<=5;i++)
		{
			if(bookArray[i] == book)
			{
				bookArray[i] = null;
				count--;
				return true;
			}
		}
		System.out.prinln("The requested book could not be found in this library!")
		return false;
	}
}
