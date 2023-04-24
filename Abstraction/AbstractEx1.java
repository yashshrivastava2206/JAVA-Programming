package Abstraction;

abstract class Shape{
	public float radius;
	Shape(){
		System.out.println("Using Abstract Class");
	}
	public abstract void setRadius(float radius);
	public abstract float getArea();
}
class Circle extends Shape{
	public void setRadius(float radius) {
		super.radius=radius;
	}
	public float getArea() {
		return (float)(2*3.14*radius);
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		Circle circle= new Circle();
//		circle.setRadius(27.7f);
		float r=circle.getArea();
		System.out.println(r);
	}

}
