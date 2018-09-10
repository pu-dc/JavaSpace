class LightSpeed {
	public static void main(String[] args) {
		int lightspeed;
		long days, seconds, distance;

		// Pendekatan kecepatan cahaya dalam km/s
		lightspeed = 300000;
		days = 100;

		// Konversi dari hari ke detik
		seconds = days * 24 * 60 * 60;

		// Hitung jarak
		distance = lightspeed * seconds;

		System.out.printf("Dalam %d hari, cahaya telah merambat sejauh %d Kilometer", days, distance);
	}
}
