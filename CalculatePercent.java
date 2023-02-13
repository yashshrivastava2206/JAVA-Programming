//WAP to enter marks of 3 subjects of a student and display its percentage 
import java.util.Scanner;

public class CalculatePercent {
    public static void main(String[] args){
        float subject1;
        float subject2;
        float subject3;
        float avg;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first subject marks :");
        subject1 = scan.nextFloat();
        System.out.print("Enter second subject marks :");
        subject2 = scan.nextFloat();
        System.out.print("Enter third subject marks :");
        subject3 = scan.nextFloat();
        avg = (subject1+subject2+subject3)/3;
        System.out.println("Percentage : "+avg);
    }
}
