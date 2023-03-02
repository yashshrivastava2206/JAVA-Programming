import java.util.Scanner;

/* Read an employee numa(NAME) , overtime hours worked(OVERTIME) ,hours of absent(ABSENT)
* And Determine the bonus payment(PAYMENT) */
public class Bonus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String NAME= scan.nextLine();
        int OVERTIME = scan.nextInt();
        int ABSENT = scan.nextInt();
        int WH = OVERTIME-(2/3)*ABSENT;
        if(WH>40)
            System.out.println("50$");
        else if(WH<=40 && WH>=30)
            System.out.println("40$");
        else if(WH<=30 && WH>=20)
            System.out.println("30$");
        else if(WH<=20 && WH>=10)
            System.out.println("20$");
        else if(WH<=10)
            System.out.println("10$");
    }

}
