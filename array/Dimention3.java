package array;

public class Dimention3 {
	private double width  = 0;
	private double height = 0;
	private double lenght = 0;

	public Dimention3() {}
	public Dimention3(double width, double height, double lenght) {
		this.width 	= width;
		this.height	= height;
		this.lenght	= lenght;
	}
	public void setWidth(double width) {
		this.width 	= width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getWidth(double width) {
		return width;
	}
	public double getHeight(double height) {
		return height;
	}
	public double getLenght(double lenght) {
		return lenght;
	}
	public String toString() {
		String str = 
			"Box\n" +
			"Width \t: " + width + "\n" +
			"Height \t: " + height + "\n" +
			"Lenght \t: " + lenght + "\n" +
			"Area \t: " + calculationArea() + "\n" +
			"Volume \t: " + calculationVolume() + "\n";
			return str;
	}

	static void user() {
		Dimention3 d3 = new Dimention3(5, 10, 20);
		System.out.println(d3);
	}
	public static void main(String[] args) {
		user();
	}

	public double calculationArea() {
		return 2 * ((width * lenght) + (width * height) + (lenght * height));
	}
	public double calculationVolume() {
		return width * height * lenght;
	}
}
