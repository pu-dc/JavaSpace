package object;

public class EvenSequence extends IntegerSequence {
	public EvenSequence() {
		super();
		value = 2;
	}
	public void reset() {
		super.reset();
		value = 2;
	}
	public void next() {
		value += 2;
		th++;
	}
}
