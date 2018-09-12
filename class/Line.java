package oop;
import javax.swing.*;

public class Line {
	Point endA, endB;

	//Creates a new instance of Line
	public Line() {
		endA = new Point();
		endB = new Point();
	}
	public Line(Point newA, Point newB) {
		endA = new Point(newA);
		endB = new Point(newB);
	}
	public Line(Line l) {
		endA = new Point(l.endA);
		endB = new Point(l.endB);
	}
	public void moveBy(double dX, double dY) {
		endA.moveBy(dX, dY);
		endB.moveBy(dX, dY);
	}
	@Override
	public String toString() {
		String str =
			"A => x : " + endA.getX() + " y : " + endA.getY() + "\n" +
			"B => x : " + endB.getX() + " y : " + endB.getY();
		return str;
	}

	static void userInterface() {
		Line l = new Line();
		System.out.println(l);

		String inX, inY;
		inX = JOptionPane.showInputDialog("Insert X : ");
		inY = JOptionPane.showInputDialog("Insert Y : ");
		double x, y;
		x = Double.parseDouble(inX);
		y = Double.parseDouble(inY);
		l.moveBy(x, y);
		System.out.println(l);
		System.exit(0);
	}

	public static void main(String[] args) {
		userInterface();
	}
}