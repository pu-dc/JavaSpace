/*
Persoalan:
	- Hitung berat dalam satuan kilogram dari masukan pon, dan sebaliknya.
	- Hitung volume benda, jika diketahui massa dan massa jenis. Satuan massa benda dihitung dengan satuan kilogram dan massa jenis dalam kilogram per meter kubik.
		Rumus:
			Massa Jenis = Massa / Volume

	- Hitung massa dari balok alumunium. Masukan berupa panjang, lebar, dan tinggi dari balok alumunium dalam meter. Diketahui kepadatan alumunium adalah 2.7 Kg/m^3.

Bahasan awal:
	Hal pokok dalam persoalan diatas adalah persamaan. Dari kajian fisika yang merupakan tetapan adalah massa jenis. Apabila massa jenis telah diketahui, yang mana telah tersedia tabel massa jenis, maka:
		- Apabila diberikan massa, maka kita dapat menghitung volumenya
		- Apabila diberikan volume, maka kita dapat menghitung massanya

	Dalam hal ini kita mengubah cara pandang algoritmik yang mementingkan komputasi menjadi cara pandang orientasi objek. Kita menyatakan sebagai membuat kelas (Mass) berikut fitur-fitur (layanan-layanan) yang harus dimiliki kelas (Mass)
*/
package token_literan;

public class Mass {
	private String name 	= "";
	private double density 	= 0;

	// Creates a new instance of Mass
	public Mass() {}
	public Mass(String name, double density) {
		this.name 		= name;
		this.density 	= density;
	}
	// Kita memanggil metode dengan memberi argumen volume benda untuk memperoleh massa benda yang terbuat dari alumunium
	public double getMass(double volume) {
		return (density * volume);
	}
	public double getDensity() {
		return density;
	}
	// Kita memanggil metode dengan memberi argumen massa benda untuk memperoleh volume benda yang terbuat dari alumunium
	public double getVolume(double mass) {
		return (mass / density);
	}
	@Override
	public String toString() {
		String str = 
			"Nama benda \t: " + name + "\n" +
			"Massa jenis \t : " + density + "\n"
		;

		return str;
	}

	static void second() {
		// Kita menginisialisasi objek m dengan Alumunium, bermassa jenis 2.89
		Mass m = new Mass("Alumunium", 2.89);
		System.out.println(m);
	}

	public static void main(String[] args) {
		second();
	}
}
