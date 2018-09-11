/*
Kriteria Relasi Ekivalensi :
	Seharusnya metode equals() memenuhi kriteria-kriteria (properti-properti) relasi ekivalensi, yaitu :
		1. Reflexive 	: x.equals(x) harus true
		2. Symmetric	: x.equals(y) harus true jika dan hanya jika y.equals(x) juga true
		3. Transitive	: Jika x.equals(y) adalah true dan y.equals(z) adadalah true, maka x.equals(z) harus juga true
		4. Consistent	: Banyak pemanggilan x.equals(y) mengirim nilai yang sama (Kecuali jika nilai-nilai state perbandingan telah berubah, misalnya telah dipanggil metode setX() terhadap field tertentu)
		5. Cautious		: x.equals(null) mengirim false, bukan melempar NullPointerException
*/
package object_class;

public class ComplexEqual {
	private final double re;
	private final double im;

	public ComplexEqual(double re, double im) {
		this.re = re;
		this.im = im;
	}

	static void userInterface() {
		ComplexEqual ce1 = new ComplexEqual(1.0, 2.0);
		ComplexEqual ce2 = new ComplexEqual(1.0, 2.01);
		ComplexEqual ce3 = new ComplexEqual(1.0, 2.0000000000001);// Up to Quadtriliun of Boolean

		if (ce1.equals(ce2)) {
			System.out.println("CE1 sama dengan CE2");
		} else {
			System.out.println("CE1 tidak sama dengan CE2");
		}
		space();
		if (ce1.equals(ce3)) {
			System.out.println("CE1 sama dengan CE3");
		} else {
			System.out.println("CE1 tidak sama dengan CE3");
		}
	}
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		userInterface();
	}
        @Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (!(o instanceof ComplexEqual)) {
			return false;
		}
		ComplexEqual otherO = (ComplexEqual) o;
		if ((re == otherO.re) && (im == otherO.im)) {
			return true;
		} else {
			return false;
		}
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
        return hash;
    }
}