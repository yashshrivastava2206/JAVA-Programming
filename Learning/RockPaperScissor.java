import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //0 for Rock
        //1 For Paper
        //2 For Scissor
        Scanner sc= new Scanner(System.in);
        System.out.print("0 for Rock\n1 For Paper \n2 For Scissor\nEnter You Choice :");
        int userChoice= sc.nextInt();
        Random random = new Random();
        int compChoice= random.nextInt(3);
        if(userChoice==compChoice){
            System.out.println("Draw");
        }
        else if ((userChoice == 0 && compChoice == 2) || (userChoice == 1 && compChoice == 0) || (userChoice == 2 && compChoice == 1)) {
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win");
        }


        if(compChoice==0){
            System.out.println("Computer Choice : Rock");
        }
        else if(compChoice==1){
            System.out.println("Computer Choice : Paper");
        }
        else{
            System.out.println("Computer Choice : Scissor");
        }
    }

}
