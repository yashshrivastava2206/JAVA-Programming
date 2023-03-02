/* Write a Java Program to fill in a letter template which bots like this:
* Letter = "Dear <|name|> , Thank You !"
* replace <|name|> with a string (Some name) */

import java.util.Scanner;

public class FIllNameTemplate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letter = "Dear <|name|> , Thank You !";
        System.out.println("Enter a name :");
        String name = sc.nextLine();
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);
    }
}
