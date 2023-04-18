
import java.util.Scanner;

public class CountWhiteSpace {
	public static void main(String [] args) {
		
	//Scanner clas is use to create a object which help us to read the input from keyboard
	Scanner sc = new Scanner(System.in);
	
	//Input the data through Kyboard 
	System.out.println("Enter a paragraph:");
	String para = sc.nextLine();
	
	//Initialize the count of white spaces to 0
	int count=0;   					
	
	
	// Iterate whole string -one by one character to find the no. of white spaces 
	for(int i=0;i<para.length();i++) {
		if(para.charAt(i)==' ') {
			//Increasing the count if white space found
			++count;
		    }
	    }
	
	//Displaying the total no. of white spaces found in the entered paragraph..
	
	System.out.println("No. of white space in a Paragraph: "+count);
	}
}
