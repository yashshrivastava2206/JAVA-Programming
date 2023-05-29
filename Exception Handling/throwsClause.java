package shashiranjan;

import java.util.Scanner;

class Super{
	boolean checkAge(int age) throws Exception {
		if(age>=18)
			return true;
		else
			throw new Exception("Age is not less than 18, You can't vote");
	}
}
public class throwsClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super ca= new Super();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		try {
			boolean chk=ca.checkAge(age);
			if(chk)
				System.out.println("You Can Vote");
		}catch(Exception e) {
		 System.out.println(e.getMessage());
		}
	}

}
