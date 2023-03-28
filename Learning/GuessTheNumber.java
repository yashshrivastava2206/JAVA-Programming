import java.util.Random;
import java.util.Scanner;


class Game {
    private int number;
    private int num;
    private int noOfGuess=0;

    Game() {
        Random random = new Random();
        number = random.nextInt(100);
        System.out.println(number);
    }
    void guessNumber(){
        noOfGuess++;
        Scanner sc = new Scanner(System.in);
        this.num= sc.nextInt();
    }
    boolean isCorrectNumber(){
        if(num==number){
            System.out.println("No. is Guessed correctly in "+noOfGuess+" times ");
            System.out.println("Right No. is "+num);
            return true;
        }
        else if(num>number){
            System.out.println("large no...");
        }
        else{
            System.out.println("Small no...");
        }
        return false;
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
        Game guess = new Game();
        boolean check= false;
        while(!check){
            guess.guessNumber();
            check=guess.isCorrectNumber();
        }
    }
}
