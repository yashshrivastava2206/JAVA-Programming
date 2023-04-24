package Unit_2;
class Shape{
	Shape(){
		System.out.println("Shape");
	}
	public void draw() {
		System.out.println("Draw Shape");
	}
	public void draw(int size) {
		System.out.println("Draw Shape with "+size+" size");
	}
	public void erase() {
		System.out.println("Erase Shape");
	}
}
class Circle extends Shape{
	Circle(){
		System.out.println("Circle");
	}
	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	@Override
	public void draw(int size) {
		System.out.println("Draw Circle with "+size+" size");
	}
	@Override
	public void erase() {
		System.out.println("Erase Circle");
	}
}
class Triangle extends Shape{
	Triangle(){
		System.out.println("Triangle");
	}
	@Override
	public void draw() {
		System.out.println("Draw Triangle");
	}
	@Override
	public void erase() {
		System.out.println("Erase Triangle");
	}
}
class Square extends Shape{
	Square(){
		System.out.println("Square");
	}
	@Override
	public void draw() {
		System.out.println("Draw Square");
	}
	@Override
	public void erase() {
		System.out.println("Erase Square");
	}
}
public class Solution1 {

	public static void main(String[] args) {
		Shape shape= new Shape();
		shape.draw();
		shape.erase();
		Shape shape1= new Circle(); //Up Casting
		shape1.draw();
		shape1.erase();
		Circle circle= new Circle();
		circle.draw();
		circle.erase();
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.erase();
		Square square= new Square();
		square.draw();
		square.erase();
	}

}
