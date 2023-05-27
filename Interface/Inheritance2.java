package Inheritance.Interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Sample2{
    //Creating Interface named Sample2
    //Abstract Method
    void sum(int n1,int n2);
    //Default Method: Supported only after Java_1.7 and after
    default void start(){
        System.out.println("Starting....");
    }
    default void stop(){
        System.out.println("Stopping....");
        Ending();
    }
    //Private Method : Only called inside the class.
    private void Ending(){
        System.out.println("Ended...");
    }
}
interface Child2_1 extends Sample2{
    //Another Interface which Extends the existing interface
    void subtract(int n1 ,int n2);
    default void running(){
        System.out.println("Running...");
    }
}
class Child2_2 implements Child2_1{
    //Class which implements the Interfaces by Overriding the abstract methods of Interfaces
    @Override
    public void sum(int n1, int n2) {
        System.out.println("Sum :"+(n1+n2));
    }

    @Override
    public void subtract(int n1, int n2) {
        System.out.println("Subtract :"+(n1-n2));
    }
}
public class Inheritance2 {
    static void solution(){
        Scanner sc= new Scanner(System.in);
        Child2_2 obj= new Child2_2();
        int num1,num2;
        obj.start();

        System.out.println("Enter Numbers");
        try {
            num1 = sc.nextInt();
            System.out.println("Enter Numbers");
            num2 = sc.nextInt();
            obj.running();
            obj.sum(num1,num2);
            obj.running();
            obj.subtract(num1,num2);
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        obj.stop();
    }
    public static void main(String[] args) {
        solution();
    }
}
