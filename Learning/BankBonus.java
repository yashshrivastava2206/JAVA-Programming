import java.util.Scanner;
import  java.lang.String;

/* A bank announces a bonus policy for its customers a bonus of 2% of
the balance is given to everyone irrespective  of the balance & 5% given to female account holders if there
there balance is more than 5000 */
public class BankBonus {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter amount of account :");
        float amount = read.nextFloat(),bonus;
        System.out.println("Enter gender of a/c holder :");
        char gender = read.next().charAt(0);
        if(gender =='f' || gender =='F'){
            if(amount>4999){
                 bonus = (amount/100)*5f;
            }
            else {
                 bonus = (amount/100)*2f;
            }
        }
        else {
             bonus = (amount/100)*2;
        }
        System.out.println("Total Amount :"+(amount+bonus));
    }
}
