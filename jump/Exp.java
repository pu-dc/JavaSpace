package jump;

public class Exp {
	private long current 	= 1;
	private double x;
	private double powerX;
	private double denom 	= 1;
	private double result 	= 1;

	public Exp(double x, int n) {
		this.x = x;
		powerX = x;
		for (int i = 0; i < n; i++) {
			next();
		}
	}
	public double get() {
		return result;
	}
	public void next() {
		denom *= current;
		double term = powerX / denom;
		result += term;
		powerX *= x;
		current++;
	}
}