interface Mul{
    int multiply(int a, int b);
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        Mul m1=(a,b)->a*b;
        System.out.println(m1.multiply(5,5));
    }
}
