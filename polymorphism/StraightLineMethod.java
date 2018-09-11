package polymorphism;

public class StraightLineMethod extends DepreciationMethod {
	@Override
	double calculationDeprec(long origin, long value, int numberOfYear, int year) throws Exception {
		if (numberOfYear == 0) {
			throw (new Exception("Jumlah tahun tidak boleh nol!"));
		}
		return (origin / numberOfYear);
	}
}