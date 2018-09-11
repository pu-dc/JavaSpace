package polymorphism;

public class Polymor {
	static void ui() {
		// Tidak apa-apa, belum menciptakan instan
		Rectangle rectangle = new Rectangle(100, 200);
		Square square 		= new Square(230);
		Circle circle 		= new Circle(240);

		printGeometry(rectangle);
		printGeometry(square);
		printGeometry(circle);
	}
	static void printGeometry(Geometry geometry) {
		System.out.println("---------- ---------- ---------- ----------");
		System.out.println("Geometry \t\t: " + geometry.getGeometry());
		System.out.println("Geometry area \t\t: " + geometry.area());
		System.out.println("Geometry circumference \t: " + geometry.circumference());
		System.out.println("---------- ---------- ---------- ----------");
	}

	public static void main(String[] args) {
		ui();
	}
}

abstract class Geometry {
	abstract public String getGeometry();
	abstract public double area();
	abstract public double circumference();
}