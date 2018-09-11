package polymorphism;

public class Square extends Geometry {
	protected int side;

	public Square(int newSide) {
		side = newSide;
	}
	@Override
	public String getGeometry() {
		return "Bujur sangkar";
	}
	// Luas bentuk bujur sangkar
	public double area() {
		return (side * side);
	}
	// Keliling bujur sangkar
	public double circumference() {
		return (4 * side);
	}
}