package practice.march05;
//Reverse of array
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter Elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<=arr.length/2;i++){
            int temp= arr[i];
            arr[i]=arr[arr.length - i-1];
            arr[arr.length - i-1]=temp;
        }
        for (int element:
              arr) {
            System.out.print(element+".");

        }
    }
}
