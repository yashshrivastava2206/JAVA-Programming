/* WAP to replace a space into whiteScore */

import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String para = sc.nextLine();
        para = para.replace(" ","_");
        System.out.println(para);
    }
}
