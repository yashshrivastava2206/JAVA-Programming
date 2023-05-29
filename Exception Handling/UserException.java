package shashiranjan;

import java.util.Scanner;

class Check extends Exception{
	private String msg;
	Check(String msg){
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
}
class CanVote {
	void checkAge(int age) throws Check {
		if(age<18)
			throw new Check("You can not vote");
		else
			System.out.println("Can Vote");
	}
}
public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		CanVote cv= new CanVote();
		try {
			cv.checkAge(age);
		} catch (Check e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
