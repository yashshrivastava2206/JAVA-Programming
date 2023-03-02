/* WAP to input marks of 5 subjects and diaplay its Division (Using else-if ladder) */

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Hindi marks:");
        int hindi = read.nextInt();
        System.out.print("Enter English marks:");
        int english = read.nextInt();
        System.out.print("Enter Physics marks:");
        int physics = read.nextInt();
        System.out.print("Enter Chemistry marks:");
        int chemistry = read.nextInt();
        System.out.print("Enter Maths marks:");
        int maths = read.nextInt();
        //  Calculate Average
        float avg = (hindi+english+physics+chemistry+maths)/5f;
        if(avg>=60)
            System.out.println("1st Division");
        else if(avg>=50 && avg<=59)
            System.out.println("2nd Division");
        else if(avg>=40 && avg<=49)
            System.out.println("3rd Division");
        else
            System.out.println("Fail");
    }
}
