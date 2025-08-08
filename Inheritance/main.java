
public class Main {

	public static void main(String[] args) {
		
		Ebook ebook1 = new Ebook("JJK","Gege Akutami",999,1500);
		PrintedBooks pbook1 = new PrintedBooks("AOT","Maapa",2000,94);
		ebook1.displayDetails();
		System.out.println();
		pbook1.displayDetails();

	}

}
