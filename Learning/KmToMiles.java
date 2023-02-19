//Write a JAVA program to enter measure in Kilometer and converted it into Miles.
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter Kilometers :");
        double KM = scan.nextDouble();
        double Miles = KM * 0.621;
        System.out.println(KM+"KM is equal to "+Miles);
    }
}
