package practice.march08;
//Sum of Array of 5 element
import java.util.Scanner;

public class ArraySum {
    static int arrSum(int []arr){
        int sum=0;
        for(int element: arr){
            sum +=element;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        int sum = arrSum(arr);
        System.out.println(sum);
    }
}
