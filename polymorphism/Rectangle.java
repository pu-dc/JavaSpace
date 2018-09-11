package polymorphism;

public class Rectangle extends Geometry {
	protected int width;
	protected int height;

	public Rectangle(int newWidth, int newHeight) {
		width 	= newWidth;
		height 	= newHeight;
	}

	public String getGeometry() {
		return "Persegi panjang";
	}
	// Luas bentuk persegi panjang
	public double area() {
		return (width * height);
	}
	// Keliling persegi panjang
	public double circumference() {
		return (2 * (width + height));
	}
}
