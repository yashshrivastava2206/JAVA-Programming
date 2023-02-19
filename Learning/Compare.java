import java.util.Scanner;

/* Use Comparision operators to find out weather a given number is greater than the
user enterend number or not */
public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no :");
        int a = scan.nextInt();
        System.out.println(a>10);           //Comparision - Check no. is greater than 10  or not
    }
}
