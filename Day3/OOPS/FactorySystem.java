package OOPS;

// Encapsulates object creation logic using Factory Method.

interface Shape{
	void draw();
}

class Circle implements Shape{
	
	public void draw () {
		System.out.println("Drawing a circle..");
	}
}

class Square implements Shape{
	
	public void draw() {
		System.out.println("Drawing a square..");
	}
}

class ShapeFactory {
	public static Shape getShape(String type) {
		return switch(type.toLowerCase()) {
		case "circle" -> new Circle();
		case "square" -> new Square();
		default -> throw new IllegalArgumentException ("Unknown shape type.");
		};
	}
}
public class FactorySystem {
	
	public static void main(String[] args) {
		
		Shape shape1 = ShapeFactory.getShape("circle");
		Shape shape2 = ShapeFactory.getShape("square");
		
		shape1.draw();
		shape2.draw();
		
	}

}
