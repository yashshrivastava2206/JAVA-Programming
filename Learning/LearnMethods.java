package practice.march08;

import java.util.Scanner;

public class LearnMethods {
    //Methods with double parameters
     int Add(int n,int m){
        return n+m;
    }
    //Methods with 3 parameters
    static int Add(int n,int m,int o){
        return n+m+o;
    }
    //Methods with four arguments
    static int Add(int n,int m,int o ,int p){
        return n+m+o+p;
    }
    //Methods with multiple arguments(Variable Arguments)(or VarArgs)
    static int Add(int ...arr){
        int sum=0;
        for(int element: arr){
            sum +=element;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int f =sc.nextInt();
        int g =sc.nextInt();
        int h =sc.nextInt();
        int i =sc.nextInt();
        int e =sc.nextInt();
        LearnMethods ab =new LearnMethods();
        // Non-Static Method
        System.out.println(ab.Add(a,b));
        // Static Methods
        System.out.println(Add(a,b,c));
        System.out.println(Add(a,b,c,d));
        System.out.println(Add(a,b,c,d,e,f,g,h,i));
    }
}
