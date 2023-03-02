/* WAP to calculate the Square root of a positive number */

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        double num = sc.nextInt();
        double res;

        res= Math.sqrt(num);        //Using Math Library
        System.out.print("Square root of "+num+" is "+res);

    }
}
