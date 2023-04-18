
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Check the entered number is Even or odd

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		//If_Else condition for checking a number
		
		if(num%2==0) {
			System.out.println("Entered number is Even");
		}
		else {
			System.out.println("Entered number is Odd");
		}
		
		//Checking By Switch()  Expression		
		boolean result= switch(num%2) {
		case 0: yield true;
		default: yield false;
		};
		if(result) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
