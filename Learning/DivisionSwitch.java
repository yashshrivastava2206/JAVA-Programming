/* WAP to input marks of 5 subjects and diaplay its Division
* (Using Switch Case)*/
import java.util.Scanner;

public class DivisionSwitch {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Hindi marks:");
        int hindi = read.nextInt();
        System.out.print("Enter English marks:");
        int english = read.nextInt();
        System.out.print("Enter Physics marks:");
        int physics = read.nextInt();
        System.out.print("Enter Chemistry marks:");
        int chemistry = read.nextInt();
        System.out.print("Enter Maths marks:");
        int maths = read.nextInt();

        int avg = (hindi+english+physics+chemistry+maths)/5;

        switch (avg/10){
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("Division 1st");
                break;
            case 5:
                System.out.println("Division 2st");
                break;
            case 4:
                System.out.println("Division 3rd");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
