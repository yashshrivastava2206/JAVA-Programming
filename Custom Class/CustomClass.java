package ClassPractice;

import java.util.Scanner;

class Employee{
    private int salary;
    private String name;

    //Setters
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getters
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


}
public class CustomClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Creating Object
        Employee yash = new Employee();

        //Set Name
        System.out.print("Enter Name:");
        yash.setName(sc.nextLine());

        //Set Salary
        System.out.print("Enter Salary:");
        yash.setSalary(sc.nextInt());
        //Get Name
        System.out.println("Nmae :"+yash.getName());
        //Get Salary
        System.out.println("Salary"+yash.getSalary());
    }
}
