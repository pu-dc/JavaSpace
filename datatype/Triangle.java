class Triangle {
	public static void main(String[] args) {
		double sideA = 3.0, sideB = 4.0;

		double sideC = Math.sqrt(sideA * sideA + sideB * sideB);

		System.out.println("Panjang sis miring : " + sideC);
	}
}

/*
Dua variable pertama sideA dan sideB diinisialisasi literal. Variable sideC diinisialisasi secara dinamis ke nilai panjang sisi miring (menggunakan teorama pythagoras). Program menggunakan metode built-in sqrt(), kels Math untuk menghitung akar kuadrat. Hal pokok diprogram itu ekspresi inisialisasi dapat menggunakan sembarang elemen sah termasuk memanggil metode, variable lain atau literal.
*/
