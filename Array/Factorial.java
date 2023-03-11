package practice.march05;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        long num =sc.nextLong(),fact=1;
        for(long i=num;i>0;i--){
            fact=fact *i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
        int a=10,b=20;
        Add n= new Add();
        n.Sum(a,b);

        System.out.println("Multiplication :"+Add.Multi(1,2));

    }
}
class Add{
    public void Sum(int a,int b){
        int c= a+b;
        System.out.println(c);
    }
    public static int Multi(int a , int b ){
        return a*b;
    }
}
