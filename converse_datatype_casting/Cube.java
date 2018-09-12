/*
Persoalan :
	Diketahui sisi suatu kubus, hitunglah :
		- Keliling
		- Luas
		- Volume
	Dari kubus tersebut

Bahasan awal :
	Kita harus membuat pernyataan ulang persoalan menjadi beraroma orientasi objek. Pernyataan dimulai "menghitung" sering beraroma algoritmik. Di orientasi objek, algoritma merupakan satu elemen terpendam/termuat di wadah objek (dipresentasikan di bagian kelas sebagai cetak biru objek).

	Pernyataan ulangnya adalah buatlah kelas kubus yang mempuyai :
		- Tanggung jawab atau fitur-fitur atau layanan-layanan

	Kata "tanggung jawab", "fitur", dan "layanan" yang diberikan "sesuatu (objek)" adalah aroma orientasi objek.

	Dalam level mikro, pandangan algoritmik dan pandangan orientasi objek telah berbeda. Kebiasaan yang dimulai dari level mikro akan terbawa dalam pemberian solusi orientasi objek skala makro beraroma orientasi objek, bukan program orientasi objek beraroma lainya.

	Solusi untuk itu adalah kelas Cube yang memiliki layanan :
		- Menyediakan informasi sisi kubus
		- Menyediakan informasi keliling kubus
		- Menyediakan informasi luas kubus
		- Menyediakan informasi volume kubus

	Layanan-layanan yang disediakan menjadi pusat perhatian bukan "algoritma" yang tidak terkait pandangan eksternal.
*/
package converse_datatype_casting;

public class Cube {
	private double side = 0;
	// Creates a new instance of Cube
	public Cube() {}
	public Cube(double side) {
		this.side = side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public double getCircumference() {
		return calculationCircumference();
	}
	public double getArea() {
		return calculationArea();
	}
	public double getVolume() {
		return calculationVolume();
	}
	@Override
	public String toString() {
		String str = 
			"Kubus \n" +
			"Panjang sisi \t= " + getSide() + "\n" +
			"Keliling \t= " + getCircumference() + "\n" +
			"Luas \t\t= " + getArea() + "\n" +
			"Volume \t\t= " + getVolume() + "\n"
		;
		return str;
	}

	static void second() {
		Cube c = new Cube(24);
		System.out.println(c);
	}
	public static void main(String[] args) {
		second();
	}

	private double calculationCircumference() {
		return (12 * getSide());
	}
	private double calculationArea() {
		return (6 * getSide() * getSide());
	}
	private double calculationVolume() {
		return (getSide() * getSide() * getSide());
	}
}
