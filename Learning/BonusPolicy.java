/* A bank once to implement a bonus policy . Bank decides to give 15% bonus to all its female customers
* and 10% bonus to the male customers. The bonus is calculated on the deposit amount  */
import java.util.Scanner;

public class BonusPolicy {
    public static void main(String[] agrs){
        Scanner read = new Scanner(System.in);
        int amount = read.nextInt();
        String gender = read.next();
        if(gender.equals("male") || gender.equals("Male")){
            amount = amount +(amount/100)*10;
        }
        else {
            amount = amount +(amount/100)*15;
        }
        System.out.println("Total Amount after adding bonus :"+amount);
    }
}
