package polymorphism;

public class DoubleDecliningBalanceMethod extends DepreciationMethod {
	double calculationDeprec(long origin, long value, int numberOFYear, int year) throws Exception {
		if (numberOFYear == 0) {
			throw (new Exception("Jumlah tahun tidak boleh nol!"));
		}
		return (2 * origin / numberOFYear);
	}
}