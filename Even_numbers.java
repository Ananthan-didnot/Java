package demo;
import java.util.Scanner;

public class Even_numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a limit: ");
		int limit  = input.nextInt();
		for(int i = 2; i < limit ; i+=2) {
			System.out.println(i);
		}

		input.close();
	}

}
