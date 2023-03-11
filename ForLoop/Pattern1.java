package practice.march05;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of pattern :");
        int  size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Reverse Pattern
        System.out.println("Reverse Pattern :");
        for(int i=size;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
