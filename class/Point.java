/*
Persoalan :
	Bagaimana memprogram garis yang dibatasi dua ujung. Kedua ujung merupakan titik.
Bahasan Awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (Line) yang menyediakan layanan geometri analiktik garis.
*/
package oop;
//import javax.swing.*;
public class Point {
	private double x, y;

	//Create a new instance of Point
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	public void moveBy(double dX, double dY) {
		x = x + dX;
		y = y + dY;
	}
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		String str =
			"X = " + x + "\n" +
			"Y = " + y + "\n";
		return str;
	}

	static void userInterface() {
		//String xIn, yIn;
		//xIn = JOptionPane.showInputDialog("Insert X :");
		//yIn = JOptionPane.showInputDialog("Insert Y :");
		//double x, y;
		//x = Double.parseDouble(xIn);
		//y = Double.parseDouble(yIn);
		System.out.println(new Point(1, 2));
		System.exit(0);
	}

	public static void main(String[] args) {
		userInterface();
	}
}