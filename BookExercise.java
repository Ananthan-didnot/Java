class Book {
	String title;
	String author;
	final int bookID;
	static int bookCounter =1000;
	final static String LIBRARY_NAME = "Central Library";
	
	Book(){
		title = "Unknown";
		author = "Unknown";
		bookID = bookCounter++;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		bookID = bookCounter++;
	}
	
	public void displayInfo() {
		System.out.println("ID: "+bookID);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
	
	public void displayInfo(boolean showlibrary) {
		if(showlibrary) {
		System.out.println("Library name: "+LIBRARY_NAME);
		}else {
			System.out.println("No library found");
		}
	}
	
	public static void displayTotalBook() {
		System.out.println("Total number of books: "+bookCounter);
	}

	
}

public class BookExercise {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Jujutsu Kaisen","Gege Akutami");
		Book b3 = new Book();
		
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo(true);
		
		Book.displayTotalBook();
	}
}