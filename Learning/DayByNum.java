import java.util.Scanner;

/* WAP to find out the day of he week given the number [1 for Monday , 2 for Tuesday ...... and so on */
/* Switch Case */
public class DayByNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("Sunnday");
            break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
