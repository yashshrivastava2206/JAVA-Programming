import java.util.InputMismatchException;
import java.util.Scanner;

interface Sample3{
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
abstract class Child3_1 implements Sample2{
    //Another Interface which Extends the existing interface
    abstract void multiply(int n1 ,int n2);
    void running(){
        System.out.println("Running...");
    }
}
class Child3_2 extends Child3_1{

    @Override
    public void sum(int n1, int n2) {
        System.out.println("Sum :"+(n1+n2));
    }

    @Override
    void multiply(int n1, int n2) {
        System.out.println("Multiply :"+(n1*n2));
    }
}
public class Interfaces3 {
    static void solution(){
        Child3_2 obj= new Child3_2();
        Scanner sc= new Scanner(System.in);
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
            obj.multiply(num1,num2);
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        obj.stop();
    }
    public static void main(String[] args) {
        solution();
    }
}
