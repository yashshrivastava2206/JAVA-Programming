package GenericProgramming;

class Calc<T1,T2>{
    T1 num1;
    T2 num2;
     public Calc(T1 num1,T2 num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getSum(){
        if(num1 instanceof Number && num2 instanceof Number)
        System.out.println("Sum:"+(Double.parseDouble(num1.toString())+Double.parseDouble(num2.toString())));
        else
            System.out.println("Concatination:"+(num1+""+num2));
    }

}
class Calc1{
    <T1,T2> void getSum(T1 num1,T2 num2){
        if(num1 instanceof Number && num2 instanceof Number)
            System.out.println("Sum:"+(Double.parseDouble(num1.toString())+Double.parseDouble(num2.toString())));
        else
            System.out.println("Concatination:"+(num1+""+num2));
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
        Calc<Integer,Float> c= new Calc<>(24,43f);
        c.getSum();
        Calc<Integer,String> c1= new Calc<>(24,"43f");
        c1.getSum();
        Calc1 c2= new Calc1();
        c2.<Integer,Integer>getSum(34,1123);
        c2.<Integer,String>getSum(62,"YASH");
    }
}
