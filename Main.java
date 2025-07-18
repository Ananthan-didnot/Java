/*******************************************************
 * --------------------------------------------------- *
 *  Project   : Book details                           *
 *  Author    : Ananthakrishnan K V                    *
 *  Version   : 1.0                                    *
 *  Language  : Java                                   *
 *  Created   : 18-07-2025                             *
 *  Updated   : 18-07-2025                             *
 *  Purpose   : Program to display book details using  *
 *  			constructors in java                   *                
 * --------------------------------------------------- *
 *            Let code flow like poetry! 🚀            *
 *******************************************************/

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.displayDetails();
		
	}

}

class Book {
	
	String title;
	String author;
	double price;
	
	Book(){
		title = "Unknown";
		author = "Not Assigned";
		price = 0;
	}
	
	void displayDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}

	
}

