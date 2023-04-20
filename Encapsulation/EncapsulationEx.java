package Encapsulation;

class Student{
	private int rollNo;
	private String name;
	private String cls;
	Student(int rollNo,String name,String cls){
		this.rollNo=rollNo;
		this.name=name;
		this.cls=cls;
	}
	Student(){}
	public String getCls() {
		return cls;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setClass(String cls) {
		this.cls=cls;
	}
	public String getStudentInfo() {
		return "[RollNo:"+rollNo+" , Name: "+name+" , Class : "+cls+"]";
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", cls=" + cls + "]";
	}
	
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		System.out.println(s1.getStudentInfo());
		System.out.println(s1);							//By Implementing toString Function
		Student s2= new Student(1,"AMAN","MCA");
		System.out.println("Roll No:"+s2.getRollNo());
		System.out.println("Name:"+s2.getName());
		System.out.println("Class:"+s2.getCls());
		System.out.println(s2.getStudentInfo());
		System.out.println(s2);							//By Implementing toString Function
			

	}

}
