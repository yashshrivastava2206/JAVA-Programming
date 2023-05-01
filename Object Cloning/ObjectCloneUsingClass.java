class Circle1 implements Cloneable{
    int radius;
    void getArea(){
        System.out.println("Area:"+(Math.PI*Math.pow(radius,2)));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloneUsingClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle1 c1= new Circle1();
        c1.radius=10;
        c1.getArea();
        Circle1 c2=(Circle1) c1.clone();
        c2.getArea();
        c2.radius=15;
        c2.getArea();
        c1.getArea();
    }
}
