package Polymorphism;

class Employee{
	public int empID;
	public String empName;
	public String deptName;
	public int salary;
	Employee(){
		
	}
	Employee(int empID,String empName,String deptName){			//Constructor Overloading
		this.empID=empID;
		this.empName=empName;
		this.deptName=deptName;
	}
	Employee(int empID,String empName,String deptName,int salary){			//Constructor Overloading
		this.empID=empID;
		this.empName=empName;
		this.deptName=deptName;
		this.salary=salary;
	}
	public int getEmpId() {
		return this.empID;
	}
	public String getEmpName() {
		return this.empName;
	}
	public String getDeptname() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}
	
	
}

class Head extends Employee{
	public String post;
	Head(){
		super();
	}
	public Head(int empID, String empName, String deptName) {
		super(empID, empName, deptName);
		this.post="Head";
	}
	public Head(int empID, String empName, String deptName,int salary) {
		super(empID, empName, deptName,salary);
		this.post="Head";
	}
	@Override
	public int getEmpId() {
		return this.empID;
	}
	@Override 
	public void setDeptName(String deptName) {
		super.deptName=deptName;
	}
	//Method OverLoading
	public void setSalary(int salary) {
		super.salary=salary;
	}
	public void setSalary(int salary,int bonus) {
		super.salary=salary+bonus;
	}
	@Override
	public String toString() {
		return "Head [post=" + post + ", empID=" + empID + ", empName=" + empName + ", deptName=" + deptName
				+ ", salary=" + salary + "]";
	}
	
	
}
public class PolymorphismEx1 {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"AJAY","CSE");
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getDeptname());
		e1.setDeptName("IT");
		System.out.println(e1.getDeptname());
		System.out.println(e1);
		
		Head e2= new Head(2,"Sejal","ME",1000000);
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());
		System.out.println(e2.getDeptname());
		e2.setDeptName("MCA");
		System.out.println(e2.getDeptname());
		e2.setSalary(70000000);
		System.out.println(e2.getSalary());
		e2.setSalary(70000000,200000);
		System.out.println(e2.getSalary());
		System.out.println(e2);
		
	}

}
