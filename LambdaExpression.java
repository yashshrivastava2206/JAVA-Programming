@FunctionalInterface
interface Calculator{
    int sum(int n1,int n2);
}
@FunctionalInterface
interface Calculator1{
    int subtract(int n1,int n2);
}
@FunctionalInterface
interface Calculator2{
    int multiply(int n1,int n2);
}
@FunctionalInterface
interface Calculator3{
    int square(int n1);
}
@FunctionalInterface
interface Calculator4{
    String Division(int n1,int n2);
}
public class LambdaExpression {
    public static void main(String[] args) {
        //Method 1:
        Calculator c=(int n1,int n2)->n1+n2;
        System.out.println("Method 1 Addition:"+c.sum(2,6));
        //Method 2:
        Calculator1 c1= new Calculator1() {
            @Override
            public int subtract(int n1, int n2) {
                return n1-n2;
            }
        };
        System.out.println("Method 2 Subtraction:"+c1.subtract(24,8));
        //Method 3:
        Calculator2 c2= (int n1,int n2)->{
            return n1*n2;
        };
        System.out.println("Method 3 Multiply:"+c2.multiply(5,5));
        //Method 4:
        Calculator3 c3= n1-> n1*n1;
        System.out.println("Method 4 Square:"+c3.square(9));
        //Method 5:
        Calculator4 c4= (int n1,int n2)->"Method 5 Division:"+(n1/n2);
        System.out.println(c4.Division(40,4));
    }
}
