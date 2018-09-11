package polymorphism;

public class SumOfTheYearsDigitMethod extends DepreciationMethod {
	double calculationDeprec(long origin, long value, int numberOfYear, int year) throws Exception {
		if (numberOfYear == 0) {
			throw (new Exception("jumlah tahun tidak boleh nol!"));
		}
		double deprec = 0.0;
		for (int i = 1; i <= year; i++) {
			deprec = (numberOfYear - i + 1) * origin / (numberOfYear * (numberOfYear + 1) / 2);
		}
		return deprec;
	}
}