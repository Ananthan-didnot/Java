
public class PrintedBooks extends Book{
	int numberOfPages;
	public PrintedBooks(String title, String author, double price,int numberOfPages) {
		super(title, author, price);
		this.numberOfPages = numberOfPages;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Pages: "+numberOfPages);
	}

}
