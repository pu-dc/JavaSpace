class Char {
	public static void main(String[] args) {
		char ch1, ch2, ch3;

		ch1 = 88;
		ch2 = 'Y';

		System.out.println("CH1 dan CH2 \t: " + ch1 + " " + ch2);
		ch3 = 'X';
		System.out.println("Ch3 berisi \t: " + ch3);
		ch3++;
		System.out.println("Sekarang CH3 bernilai : " + ch3);
	}
}

/*
Meskipun char bukan bilangan bulat tapi dalam banyak kasus kita dapat mengoperasikan seolah-olah sebagai bilangan bulat. Dengan demikian, kita dapat melakukan penjumlahan dua karakter atau menaikan nilai variable karakter. Karakteristik ini banyak dimanfaatkan untuk manipulasi karakter seperti mengetahui huruf kapital dan huruf kecil.
*/
