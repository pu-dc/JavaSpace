class Boolean {
	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println(b);
		b = true;
		System.out.println(b);

		if (b) {
			System.out.println("If");
		} else {
			System.out.println("Else");
		}
		System.out.println(10 > 9);
	}
}

/*
Perlu diketahui bahwa:
	1. Metode println() menghasilkan nilai "true" dan "false"
	2. Nilai variable boolean sudah memadai untuk mengendalikan pernyataan kendali, sehingga tidak perlu menulis pernyataan seperti berikut:
		if (b == true) ...
	3. Keluaran dari operator relasional >, >=, =, !=, <=, < adalah bertipe boolean 
*/
