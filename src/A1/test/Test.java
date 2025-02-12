package A1.test;

import A1.book.*;
import A1.library.*;

 public class Test {

	public static void main(String[] args) {
		Library myLibrary = new Library(); // make a new library
		
		Book myBook1 = Book.newBook("Hitchhikers Guide to the Galaxy", // make three books
									"Douglas Adams", 
									"‎0345391802",
									12.50); 
		
		
		Book myBook2 = Book.newBook("Pride and Prejudice",
									"Jane Austen", 
									"‎0141439518",
									10.25);
		
		
		Book myBook3 = Book.newBook("War of the Worlds",
									"H. G. Wells", 
									"‎1505260795",
									7.75);
		Book myBook4 = Book.newBook("fake book",
									"fake name",
									"fake isbn",
									10000.00);
		
		System.out.println("Adding books...");
		if(myLibrary.addBook(myBook1) && // add books to library
				myLibrary.addBook(myBook2) &&
				myLibrary.addBook(myBook3)) {
			System.out.println("Books added!");
		}
		
		System.out.println("\n--BOOKS--");
		myLibrary.displayBooks();
		System.out.println("---------\n");
		
		System.out.println("--Searching for Book--");
		System.out.println(myBook1);
		System.out.println("Searching...");
		System.out.println(myLibrary.searchByISBN(myBook1.getISBN()));
		System.out.println("----------------------");
		
		System.out.println("Removing: " + myBook3);
		if(myLibrary.removeBook(myBook3)) {
			System.out.println("Removed Successfully!");
		}
		else {
			System.out.println("Could not remove!");
		}
		System.out.println("\n");
		
		
		System.out.println("Removing: " + myBook4);
		if(myLibrary.removeBook(myBook3)) {
			System.out.println("Removed Successfully!");
		}
		else {
			System.out.println("Could not remove!");
		}
		System.out.println("\n");
		
		System.out.println("\n--BOOKS--");
		myLibrary.displayBooks();
		System.out.println("---------\n");
	}
}