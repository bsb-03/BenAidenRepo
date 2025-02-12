package A1.library;
import A1.book.Book;

public class Library {
	private Book[] bookArray = new Book[5];
	private int count = 0;
	
	/** public boolean addBook - This method adds a book object to a library.
	 * 
	 * @param book - This is the book object to be added to the library
	 * @return
	 */
	public boolean addBook(Book book){
		int i=0;
		for(i=0; i<5;i++)
		{
			if(bookArray[i] == null)
				break;
		}
		if(i==5) {
			System.out.println("Your library is full!");
			return false;
		}
		bookArray[i] = book;
		this.setCount(this.getCount() + 1);
		return true;
	}

	/** public boolean removeBook - This method removes a book object from a library.
	 * 
	 * @param book - This is the book object to be removed from the library
	 * @return
	 */
	public boolean removeBook(Book book) {
		for(int i=0;i<5;i++)
		{
			if(bookArray[i] == book)
			{
				bookArray[i] = null;
				setCount(getCount() - 1);
				return true;
			}
		}
		//System.out.println("The requested book could not be found in this library!");
		return false;
	}
	
	/** public Book searchByISBN - This method searches a library for a book with an ISBN code that matches the input.
	 * 
	 * @param ISBN - This is the input ISBN code that is to be searched for within the library.
	 * @return
	 */
	public Book searchByISBN(String ISBN) {
		//System.out.println("---DEBUGGING searchByISBN---");
		//System.out.println("ISBN to find: " + ISBN);
		Book cmpBook = null;
		for(int i = 0; i < 5; i++) {
			if(bookArray[i] != null) {
				cmpBook = bookArray[i];
				//System.out.println("Comparing: " + cmpBook.getISBN() + " " + ISBN);
				
				if((cmpBook.getISBN()).equals(ISBN)) {
					return cmpBook;
				}
			}
		}
		
		return null;
	}
	
	/** public void displayBooks() - This method displays all of the book objects in a library
	 * 
	 * @return
	 */
	public void displayBooks() {
		for(int i=0;i<5;i++)
		{
			if(bookArray[i] != null) {
				System.out.println(bookArray[i]);
			}
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
