import java.util.Scanner;

public class Grade_computation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Grade: ");
		String grade = input.nextLine();
		
		grade = grade.toUpperCase();
		
		String result = switch (grade){
			case "O"  -> "Outstanding Preformance";
			case "A+" -> "Excellent Performance";
			case "A"  -> "Very Good Preformance";
			case "B"  -> "Above average Preformance";
			case "C"  -> "Average Preformance";
			case "D"  -> "Bad Preformance";
			case "P"  -> "Pass";
			case "F"  -> "Fail";
			default   -> "Invalid Grade";
		};
		
		System.out.println("Grade: "+ grade);
		System.out.println("Result: "+result);
		
		input.close();
	}

}
