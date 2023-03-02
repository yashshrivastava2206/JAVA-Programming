/* WAP to check weather a student is Pass or Fail */

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 5 Subject marks :");
        int sub1 = read.nextInt();
        int sub2 = read.nextInt();
        int sub3 = read.nextInt();
        int sub4 = read.nextInt();
        int sub5 = read.nextInt();
        float avg = (sub1+sub2+sub3+sub4+sub5)/5;
        if(avg>=33)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
