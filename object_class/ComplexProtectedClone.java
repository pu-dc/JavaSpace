/*
Pendekatan Pertama :
	Berikut ini program mengimplementasikan interface Cloneable dan mendefinisikan metode cloneComplex yang memanggil clone() di Object.
*/
package object_class;

public class ComplexProtectedClone {	
	private double re;
	private double im;

	//Creates a new instance of ComplexProtectedClone
	public ComplexProtectedClone() {
		re = 0.0;
		im = 0.0;
	}
	public ComplexProtectedClone(double re, double im) {
		this.re = 0.0;
		this.im = 0.0;
	}
	public void setRe(double re) {
		this.re = re;
	}
	public void setIm(double im) {
		this.im = im;
	}
	public double getRe() {
		return re;
	}
	public double getIm() {
		return im;
	}
	// Metode ini memanggil clone() di object
	public ComplexProtectedClone cloneComplex() {
		try {
			// Memanggil clone di object
			return (ComplexProtectedClone) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Clonning tidak diijinkan! :: " + e);
			return this;
		}
	}

	static void userInterface() {
		ComplexProtectedClone cpc = new ComplexProtectedClone();
		ComplexProtectedClone cpc2;
			cpc.setRe(10.0);
			cpc.setIm(50.0);

		// Melakukan clone terhadap aComplex1
		cpc2 = cpc.cloneComplex();

		System.out.println("CPC : " + cpc.getRe() + " " + cpc.getIm());
		System.out.println("CPC2 : " + cpc2.getRe() + " " + cpc2.getIm());
	}

	public static void main(String[] args) {
		userInterface();
	}
}