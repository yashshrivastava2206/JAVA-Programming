package practice.march03;

import java.util.Scanner;

public class LearnArray {
    public static void main(String[] args) {
        int []num = new int[10];
        System.out.println(num.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for (int i =0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        for(int element : num){
            System.out.println(element);
        }
    }
}
