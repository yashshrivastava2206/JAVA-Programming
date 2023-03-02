import java.util.Scanner;

/* WAP to format the following letter using escape sequence characters */
public class FormatLetter {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String letter = " Dear Yash , You are the best , and , you can do anything. ";
        System.out.println(letter.replace(",","\n"));
    }
}
