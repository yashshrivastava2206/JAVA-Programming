import java.util.Scanner;

public class UnitCharge {
    public static void main(String[] agrs){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Units : ");
        float units = read.nextFloat();
        float amount;
        if (units<=200){
            amount = units*0.50f;
        }
        else if (units>200 && units <=400)
            amount= 100+ 0.65f*(units-200);
        else if( units >400 && units <=600)
            amount = 230 + 0.80f*(units-400);
        else
            amount = 390 + (units-600);
        System.out.println("Payable amount : "+amount);
    }

}
