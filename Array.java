import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int n = input.nextInt();
		int [] array = new int[n];
		
		System.out.print("Enter the elements: ");
		for(int i=0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		for(int i=0; i < n; i++) {
			System.out.print(array[i]+"\t");
		}
		int largest = array[0];
		for(int i=0; i < n; i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
		}

		System.out.println("\nLargest number in array: "+largest);
	}

}
