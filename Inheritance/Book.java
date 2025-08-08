
public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void displayDetails(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
