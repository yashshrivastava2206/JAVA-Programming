import java.util.Scanner;

/* WAP to detect double and triple spaces in a string */
public class DetectSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println(str.indexOf("  "));   //Return -1 if no double space found otherwise non-negative value
        System.out.println(str.indexOf("   "));  //Return -1 if no triple space found otherwise non-negative value
    }
}
