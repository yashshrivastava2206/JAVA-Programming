package ClassPractice;

import java.util.Scanner;

class Rectangle{
    float length;
    float width;
    //Methods
    public float area(){
        return length*width;
    }
    public float parameter(){
        return 2*(length+width);
    }
}
public class CustomClass4 {
    public static void main(String[] args) {
        //Creating objects
        Scanner sc= new Scanner(System.in);
        Rectangle rec=new Rectangle();
        //Intializing values
        System.out.print("Enter the length :");
        rec.length=sc.nextFloat();
        System.out.print("Enter the Width :");
        rec.width=sc.nextFloat();
        //Calling Methods
        System.out.println("Area :"+rec.area());
        System.out.println("Parameter :"+rec.parameter());
    }
}
