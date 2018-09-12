/* BOX

Persoalan :
Diketahui sisi panjang, lebar, dan tinggi suatu balok.

Pertanyaan :
Hitunglah
- Luas sisinya
- Volume balok

*/
import javax.swing.*;

public class Box {
	private double width 	= 0;
	private double height 	= 0;
	private double length 	= 0;

	public Box(double width, double height, double length) {
		this.width 	= width;
		this.height = height;
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.width = height;
	}
	public void setLength(double length) {
		this.width = length;
	}

	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return calcArea();
	}

	public String toString() {
		String str =
			"BOX\n" +
			"Length \t: " + length + "\n" +
			"Width \t: " + width + "\n" +
			"Height \t: " + height + "\n" +
			"Area \t: " + calcArea() + "\n" +
			"Volume \t: " + calcVolume() + "\n";
		return str;
	}

	static void userInterface() {
		String w, h, l;
		w = JOptionPane.showInputDialog("Insert Width :");
		h = JOptionPane.showInputDialog("Insert Height :");
		l = JOptionPane.showInputDialog("Insert Length :");
		double width 	= Double.parseDouble(w);
		double height 	= Double.parseDouble(h);
		double length 	= Double.parseDouble(l);
		System.out.println(new Box(width, height, length));
		System.exit(0);
	}	

	public static void main(String[] args) {
		userInterface();
	}

	private double calcArea() {
		return 2 * ((width * length) + (width * height) + (length * height));
	}
	private double calcVolume() {
		return width * length * height;
	}
}
