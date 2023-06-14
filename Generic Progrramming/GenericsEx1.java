package GenericProgramming;


class Calculator1<T>{
    //Generic Class
    T num1,num2;
    void add(T num1,T num2){
        if(num1 instanceof Number && num2 instanceof Number)
        System.out.println("Sum :"+(Double.parseDouble(num1.toString())+Double.parseDouble(num2.toString())));
        else
            System.out.println("Concatination:"+(num1+""+num2));
    }
}
class Calculator2{
    //Generic Method
    <T>void getSum(T num1,T num2){
        if(num1 instanceof Number && num2 instanceof Number)
            System.out.println("Sum :"+(Double.parseDouble(num1.toString())+Double.parseDouble(num2.toString())));
        else
            System.out.println("Concatination:"+(num1+""+num2));
    }
}

public class GenericsEx1 {
    public static void main(String[] args) {
        Calculator1<Integer> c= new Calculator1<Integer>();
        c.add(23,64);
        Calculator1<String> ca= new Calculator1<>();
        ca.add("KIET ","MCA");
        Calculator2 c1= new Calculator2();
        c1.<Integer>getSum(76,878);
        c1.<String>getSum("Yash ","Shrivastava");
    }
}
