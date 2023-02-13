import java.util.Scanner;

//Write a JAVA program which asks the user to enter his/her name and greets them with
//"Hello <name>,have a good day "
public class HelloName {
    public static void main (String[] agrs){
        System.out.print("Enter a name :");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello "+name+" have a good day");
    }
}
