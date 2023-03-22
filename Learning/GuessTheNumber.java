import java.util.Random;
import java.util.Scanner;

import static jdk.vm.ci.sparc.SPARC.l1;

class GuessNumber{
    private int num;
    private int number;

    Scanner sc =new Scanner(System.in);
    public GuessNumber(){
        Random random = new Random();
        num = random.nextInt(101);
//        System.out.println(num);
    }
    public int takeInput(){
        number = sc.nextInt();
        return number;
    }
    public boolean isCorrectNumber(int n){

    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        Create a class game , which allows a user to play " Guess The Number "
        game once . Game should have the following Methods :
        1. Constructor to generate the random number:
        2. takeUserInput() to take user input of a number
        3. isCorrectNumber() to detect whether number entered by the user is true
        Use properties such as noOfGuesses(int), etc to get this task done .
        */
        Scanner sc = new Scanner(System.in);
        GuessNumber GS= new GuessNumber();
        System.out.print("Guess a Number :");
        int a=GS.takeInput();
        if(GS.isCorrectNumber(a)){
            System.out.println("Right Guess");
        }
        else{
            a=GS.takeInput();
            
        }
    }
}
