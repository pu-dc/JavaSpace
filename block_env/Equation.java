package block_env;

public class Equation {
	double calcF1(double guess) {
		return (10 - 3 * guess * guess);
	}
	double calcF2(double guess) {
		return Math.pow(calcF1(guess),0.2);
	}
}
