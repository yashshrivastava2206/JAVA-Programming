class Circle{
    int r;
    void getArea(){
        System.out.println("Area of Circle :"+(3.14*r*r));
    }
}
public class ShallowCloning {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.r=10;
        c1.getArea();       // Output-> 314.0
        Circle c2= c1;       // Shallow Cloning of object
        c2.getArea();       // Output-> 314.0
        c2.r=5;
        c2.getArea();       // Output-> 78.5
        c1.getArea();       // Output-> 78.5 -->Shallow cloning effects the original object

    }
}
