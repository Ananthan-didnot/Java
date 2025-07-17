/*******************************************************
 * --------------------------------------------------- *
 *  Project   : Java Objects                           *
 *  Author    : Ananthakrishnan K V                    *
 *  Version   : 2.0                                    *
 *  Language  : Java                                   *
 *  Created   : 17-07-2025                             *
 *  Updated   : 17-07-2025                             *
 *  Purpose   : Program to familiarize java objects    *
 * --------------------------------------------------- *
 *            Let code flow like poetry! 🚀            *
 *******************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Book book = new Book("DC BOOKS");

        /*book.title = "Wings of Fire";
        book.author = "APJ Abdul Kalam";*/
        book.readDetails();
        book.printDetails();

    }
}

class Book {

    Scanner input = new Scanner(System.in);

    String publisher;
    String title;
    String author;

    Book(String pb){
        this.publisher = pb;
    }

    public void readDetails(){
        System.out.print("Enter the details of the book(Title,Author): ");
        title = input.nextLine();
        author = input.nextLine();
    }

    public void printDetails(){
        System.out.println("Title: "+title);
        System.out.println("Autor: "+author);
        System.out.println("Publisher: "+publisher);
    }
}
