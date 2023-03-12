package practice.march08;

import java.util.Scanner;

// WAP to find out wheather a given integer is present in an array or not.
public class FindElement {
    static boolean findEle(int []a,int ele){
        for(int e: a){
            if(e==ele)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr = new int[10];
        System.out.println("Enter 10 elements :");
        for(int i =0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter one element to find in arry :");
        int find =sc.nextInt();
        boolean result = findEle(arr,find);
        if(result)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
