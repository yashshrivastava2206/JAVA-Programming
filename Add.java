// WAP to input two no. through keyboard and display the addition of the given numbers
import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First No :");
        int a = scan.nextInt();
        System.out.print("Enter Second No :");
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("Sum of "+a+" and "+b+" is : "+c);
    }
}
