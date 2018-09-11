package object;

public class OddSequence extends IntegerSequence {
	public OddSequence() {
		super();
	}
	public void next() {
		value += 2;
		th++;
	}
}