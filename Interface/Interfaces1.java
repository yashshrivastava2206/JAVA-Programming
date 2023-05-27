import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Sample1{
    void add(int num1,int num2);
    void subtract(int num1,int num2);
}
class Child1 implements Sample1{

    @Override
    public void add(int num1, int num2) {
        System.out.println("Addition :"+(num1+num2));
    }

    @Override
    public void subtract(int num1, int num2) {
        System.out.println("Subtract :"+(num1-num2));
    }
}
public class Interfaces1 {
    static void tryCatch(){
        int num1 = 0,num2=0,result;
        Child1 obj= new Child1();
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        System.out.println("Enter Number :");
        try {
            num1= Integer.parseInt(br.readLine());
            num2= Integer.parseInt(br.readLine());
            obj.add(num1,num2);
            obj.subtract(num1,num2);
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
//
        System.out.println("End");
    }
    public static void main(String[] args) {
    tryCatch();
    }
}
