package practice.march08;

import java.util.Scanner;

public class CheckSortArray {
    static boolean checkSortedArray(int []a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaration of array

        int[] arr = new int[5];

        //Initialization of array
        System.out.print("Enter 5 element :");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        boolean result = checkSortedArray(arr);
        if(result)
            System.out.println("Sorted Array");
        else
            System.out.println("Not Sorted Array");

    }
}
