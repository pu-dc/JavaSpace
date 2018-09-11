package object;

public class FibonacciSequence extends IntegerSequence {
	private int prevValue;
	public FibonacciSequence() {
		super();
		prevValue = 0;
	}
	public void reset() {
		super.reset();
		prevValue = 0;
	}
	public int itemTH(int Nr) {
		prevValue = 0;
		return (super.itemTH(Nr));
	}
	public void next() {
		int temp = value;
		value += prevValue;
		prevValue = temp;
		th++;
	}
}