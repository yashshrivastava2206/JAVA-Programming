package practice.march08;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaration of array

        int[] arr = new int[5];

        //Initialization of array
        System.out.print("Enter 5 element :");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        //Find Maximum Element
        int min = arr[0];
        for (int element : arr) {
            if (element < min)
                min = element;
        }

        //Print Maximum Element
        System.out.println("Maximum Element " + min);
    }
}
