package polymorphism;

public class Circle extends Geometry {
	final double PI = 3.14;
    protected double radius;

	public Circle(double newRadius) {
		radius = newRadius;
	}
    @Override
	public String getGeometry() {
		return "Lingkaran";
	}
	// Luas bentuk lingkaran
	public double area() {
		return (PI * radius * radius);
	}
	// Keliling lingkaran
	public double circumference() {
		return (2 * PI * radius);
	}
}
