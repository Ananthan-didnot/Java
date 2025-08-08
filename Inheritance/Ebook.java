
public class Ebook extends Book{
	double fileSizeMB;
	public Ebook(String title, String author, double price,double fileSizeMB) {
		super(title, author, price);
		this.fileSizeMB = fileSizeMB;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("File Size(MB): "+fileSizeMB);
	}
}
