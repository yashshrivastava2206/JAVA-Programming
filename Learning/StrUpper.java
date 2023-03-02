/*  WAP to convert the entire string to upper case*/

import java.util.Scanner;

public class StrUpper {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = read.nextLine();
        System.out.println(str.toUpperCase());
    }
}
