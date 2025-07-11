package demo;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		
		int num = number;
		
		int result = 0;
		
		while(num != 0) {
			int rem = num % 10;
			result = result * 10 + rem;
			num /= 10;
		}
		
		if(result == number) {
			System.out.println(number + " is a Palindrome");
			System.out.println("Result: " + result);
		}
		else {
			System.out.println(number + " is NOT a Palindrome");
			System.out.println("Result: " + result);
		}
		
		input.close();
		
	}

}
