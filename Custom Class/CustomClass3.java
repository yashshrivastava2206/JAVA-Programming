package ClassPractice;


import java.util.Scanner;

class Square{
    //property
    float side;
    //Methods
    public float area(){
        return side*side;
    }
    public float parameter(){
        return 4*side;
    }
    public float area1(float a){
        return a*a;
    }

}
public class CustomClass3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creating Objects
        Square sq= new Square();
        System.out.print("Enter the side :");
        //Initialize value
        sq.side=sc.nextFloat();
        //Calling Methods
        float area=sq.area();
        System.out.println("Area :"+area);
        float para=sq.parameter();
        System.out.println("Parameter :"+para);
        float area1=sq.area1(7.2f);
        System.out.println("Area ...:"+area1);

    }
}
