/* WAP to find the area of a circle */

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle :");
        double radius = sc.nextInt();
        double area = 3.14*Math.pow(radius,2);
        System.out.println("Area of a circle : "+area);
    }
}
