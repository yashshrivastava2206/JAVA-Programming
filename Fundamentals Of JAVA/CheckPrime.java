
public class CheckPrime {

	public static void main(String[] args) {
		// Program to check weather a number is prime or not
		int n=7;
		boolean result=true;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				result=false;
				break;
			}
		}
		if(result) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
