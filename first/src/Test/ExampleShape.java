package Test;

abstract class Shape {

	public abstract void shapeEdge();

	abstract double area();
}

class Triangle extends Shape {
	
	double base;
	double height;
	
	public Triangle( double base, double height) 
	{

		this.base = base;
		this.height = height;
	}
	
	@Override
	double area() {
		return 0.5 * base * height;
	}

	public void shapeEdge() {
		System.out.println("The triangle has 3 edges");
	}
}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle( double length, double width) 
	{

		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	public void shapeEdge() {
		System.out.println("The rectangle has 4 edges");
	}
}

public class ExampleShape {
	public static void main(String[] args) {

		Triangle t = new Triangle(5,5);
		Rectangle r = new Rectangle(2,3);
		
		t.shapeEdge();
		System.out.println("The area of Triangle is "+t.area());
		r.shapeEdge();
		System.out.println("The area of rectangle is "+r.area());
		

	}
}