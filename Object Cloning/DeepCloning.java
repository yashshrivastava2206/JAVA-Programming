class Rectangle {
     int length;
     int breath;
     void getArea(){
         System.out.println("Area of rectangle:"+(length*breath));
     }
 }
public class DeepCloning {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=10;
        r1.breath=20;
        r1.getArea();                           //Output->Area of rectangle:200
        Rectangle r2= new Rectangle();
        r2.length=r1.length;                   // Deep Cloning
        r2.breath=r1.breath;                   //Deep Cloning
        r2.getArea();;                         //Output->Area of rectangle:200
        r2.length=15;
        r2.breath=35;
        r1.getArea(); //Output->Area of rectangle:200-->Changing the cloned object does not affect original object
        r2.getArea();                           //Output->Area of rectangle:525
    }
}
