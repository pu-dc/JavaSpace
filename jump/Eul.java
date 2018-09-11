package jump;

public class Eul {
	private long current 	= 1;
	private double denom 	= 1;
	private double result 	= 1;

	public Eul(int n) {
		for (int i = 0; i < n; i++) {
			next();
		}
	}
	public double get() {
		return result;
	}
	public void next() {
		denom *= current;
		double term = 1 / denom;
		result += term;
		current++;
	}
}