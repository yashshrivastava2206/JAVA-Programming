import java.util.Scanner;

/* WAP to input a number and check weather a no. is  even or odd  */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0)
            System.out.println("Even no.");
        else
            System.out.println("Odd no.");
    }

}
