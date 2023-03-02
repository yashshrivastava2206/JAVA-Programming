import java.util.Scanner;

public class VoterCheck {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the agre of a person:");
        int age = read.nextInt();
        if(age>=18)
            System.out.println("Eligible for voting ");
        else
            System.out.println("Not Eligible for voting ");
    }
}
