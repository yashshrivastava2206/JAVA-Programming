package shashiranjan;

import java.util.Scanner;

class Invalid extends Exception{
	private String msg;
	Invalid(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
class Customer{
	private String custNo;
	private String custName;
	private String category;
	Customer(String custNo,String custName,String category){
		this.custNo=custNo;
		this.custName=custName;
		this.category=category;
	}
	void checkCustNo() throws Invalid {
		if(custNo.charAt(0)=='C' || custNo.charAt(0)=='c') {
			System.out.println("Customer Number is Valid");
		}
		else
			throw new Invalid("Customer no. is not valid");
	}
	void checkCustName() throws Invalid {
		if(custName.length()>=4) {
			System.out.println("Customer Name is Valid");
		}
		else
			throw new Invalid("Customer name is not valid");
	}
	void checkCategory() throws Invalid {
		if(category=="Platinum" || category=="Gold" || category=="Silver") {
			System.out.println("Category is Valid");
		}
		else
			throw new Invalid("Category is not valid");
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Number:");
		String custNo=sc.nextLine();
		System.out.print("Enter Customer Name:");
		String custName= sc.nextLine();
		System.out.print("Enter Category: ");
		String category= sc.nextLine();
		Customer cust= new Customer(custNo,custName,category);
		try {
			cust.checkCustNo();
		} catch (Invalid e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			cust.checkCustName();
		} catch (Invalid e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			cust.checkCategory();
		} catch (Invalid e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
