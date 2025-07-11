/*******************************************************
 * --------------------------------------------------- *
 *  Project   : Even Number Generator                  *
 *  Author    : Ananthakrishnan K V                    *
 *  Version   : v1.0                                   *
 *  Language  : Java                                   *
 *  Created   : 11-07-2025                             *
 *  Updated   : 11-07-2025                             *
 *  Purpose   : A program that print even numbers      *
 *              upto a limit.                          *
 * --------------------------------------------------- *
 *            Let code flow like poetry! 🚀            *
 *******************************************************/


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
