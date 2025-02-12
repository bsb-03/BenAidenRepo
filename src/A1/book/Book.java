package A1.book;

/**
 * Book class. Has variables title, author, ISBN, and price.
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	
	/**
	 * Default constructor for book class.
	 * @return
	 */
	public static Book newBook() { // default constructor
		Book newBook = new Book();
		
		newBook.setTitle("Unknown"); 
		newBook.setAuthor("Unknown");
		newBook.setISBN("Unknown");
		newBook.setPrice(0.0);
		
		return newBook;
	}
	
	/**
	 * Parameterized constructor for book class.
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param price
	 * @return
	 */
	public static Book newBook(String title, String author, String ISBN, double price) { // parameterized constructor
		Book newBook = new Book();
		
		newBook.title = title;
		newBook.author = author;
		newBook.ISBN = ISBN;
		newBook.price = price;
		
		return newBook;
	}
	
	/**
	 * Copy constructor for book class.
	 * @param bookToCopy
	 * @return
	 */
	public Book newBook(Book bookToCopy) { // copy constructor
		Book newBook = new Book();
		
		newBook.title = bookToCopy.getTitle();
		newBook.author = bookToCopy.getAuthor();
		newBook.ISBN = bookToCopy.getISBN();
		newBook.price = bookToCopy.getPrice();
		
		return newBook;
	}
	
	/**
	 * Gets title of book.
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets title of book.
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets author of book.
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets author of book.
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets ISBN of book.
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets ISBN of book.
	 * @param iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Gets price of book.
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets price of book.
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * toString implementation for book.
	 */
	public String toString() { // overridden toString()
		return ("Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", ISBN: " + this.ISBN + ", Price: " + this.getPrice());
	}
	
	/**
	 * Equals implementation for book.
	 */
	public boolean equals(Object other) { // overridden equals
		Book cmpBook = (Book) other;
		
		if(this.getISBN() == cmpBook.getISBN()) {
			return true;
		}
		
		return false;
	}
}
