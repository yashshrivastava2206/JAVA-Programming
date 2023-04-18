import java.util.*;

class FindGreater{
	//WAJP to insert 3 numbers from keyboard and find out greater number among three numbers.
	private int num1,num2,num3;
	public void takeThreeInputs() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number:");
		this.num1=sc.nextInt();
		System.out.print("Enter Second Number:");
		this.num2=sc.nextInt();
		System.out.print("Enter Second Number:");
		this.num3=sc.nextInt();
		
	}
	public int findGreatestNumber() {
		if(num1>num2 || num1==num2) {
			if(num1>num3 || num1==num3)
				return num1;
			else 
				return num3;
		}
		if(num2>num1 || num2==num1) {
			if(num2>num3 || num2==num3)
				return num2;
			else
				return num3;
		}
		return -1;
	}
}
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindGreater obj= new FindGreater();
		obj.takeThreeInputs();
		int result = obj.findGreatestNumber();
		System.out.println("Greatest Number is :"+result);
	}

}
