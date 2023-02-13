//Write a JAVA program to detect weather a number entered by the user is integer or not.
import java.util.Scanner;

public class DetectNumInt {
    public static void main(String[] args){
        System.out.print("Enter Something : ");
        Scanner scan = new Scanner(System.in);
        Boolean a= scan.hasNextInt();
        System.out.println(a);
    }
}
