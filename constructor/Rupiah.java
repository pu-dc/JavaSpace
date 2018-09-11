/*
Persoalan :
	Persoalan ini biasa dijumpai dibidang akuntansi dalam hal ini kita diminta menuliskan jumlah uang dalam kata-kata sebagai berikut :
		10			sepuluh
		11			sebelas
		1034		Seribu tiga puluh empat
		10030001	Sepuluh juta tiga puluh ribu satu

Deskripsi :
	Buatlah penyelesaian menggunakan metode-metode yang menerapkan prinsip Single Entry, Single Exit.

Bahasan Awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (Rupiah) yang menyediakan layanan penulisan besaran angka dalam teks Bahasa Indonesia.
*/
public class Rupiah {
	long amount = 0;
	//Creates new instance of Rupiah
	public Rupiah(long amount) {
		this.amount = amount;
	}
	public void setAmount (long amount) {
		this.amount = amount;
	}

	static void t01 () {
                int i;
		for (i = 0; i < 1; i++) {
			System.out.println(new Rupiah(i));
		}
	}
	static void t02 () {
		Rupiah r = new Rupiah(1000000L);
		System.out.println("> " + r.getText());
	}

	public static void main(String[] args) {
		t01();
		t02();
	}

	public String getText() {
		String s = "" + amount;
		String str = "";

		//Kasus dibawah 1000
		if (s.length() < 4) {
			return convert3Digit(Integer.parseInt(s));
		}
		//Kasus amount 1.000 s/d 9.999
		if (s.length() == 4) {
			return convert4Digit(Integer.parseInt(s));
		}
		//Kasus 10.000 s/d 99.999
		if (s.length() > 5 && s.length() <= 6) {
			return convert5_6Digit(amount);
		}
		//Kasus 1.000.000 s/d 999.999.999
		if (s.length() >= 7 && s.length() <= 9) {
			return convert7_9Digit(amount);
		}
		//Kasus 1.000.000.000 s/d 999.999.999.999
		if (s.length() >= 10 && s.length() <= 12) {
			return convert10_12Digit(amount);
		}
		//Kasus 1.000.000.000.000 s/d 999.999.999.999.999
		if (s.length() >= 13 && s.length() <= 15) {
			return convert13_15Digit(amount);
		}
		//Kasus 1.000.000.000.000.000 s/d 999.999.999.999.999.999
		if (s.length() >= 16 && s.length() <= 18) {
			return convert16_18Digit(amount);
		}

		return str;
	}
	public String toString() {
		String str = amount + " adalah " + getText();
		return str;
	}

	private String convert1Digit(int n) {
		switch(n) {
			case 0: return "nol ";
			case 1: return "satu ";
			case 2: return "dua ";
			case 3: return "tiga ";
			case 4: return "empat ";
			case 5: return "lima ";
			case 6: return "enam ";
			case 7: return "tujuh ";
			case 8: return "delapan ";
			case 9: return "sembilan ";
			default : return "";
		}
	}
	private String convert10_19(int n) {
		switch(n) {
			case 10: return "sepuluh ";
			case 11: return "sebelas ";
			case 12: return "duabelas ";
			case 13: return "tigabelas ";
			case 14: return "empatbelas ";
			case 15: return "limabelas ";
			case 16: return "enambelas ";
			case 17: return "tujuhbelas ";
			case 18: return "delapanbelas ";
			case 19: return "sembilanbelas ";
			default : return "";
		}
	}
	private String convert2Digit(int n) {
		if (n == 0) {
			return "";
		}
		if (n < 10) {
			return convert1Digit(n);
		}
		if (n >= 10 && n <= 19) {
			return convert10_19(n);
		}

		int div10, mod10;
		div10 = n / 10;
		mod10 = n % 10;

		String str = "";
		str += convert1Digit(div10) + "puluh ";

		if (mod10 > 0) {
			return (str + convert1Digit(mod10));
		}
		return str;
	}
	private String convert3Digit(int n) {
		if (n == 0) {
			return "";
		}

		String str = "";
		int div100, mod100;
		div100 = n / 100;
		mod100 = n % 100;

		switch(div100) {
			case 1: str += "seratus "; break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				str += convert1Digit(div100) + "ratus "; break;
			default : str += "";
		}
		if (mod100 > 0) {
			return (str + convert2Digit(mod100));
		}
		return str;
	}
	private String convert4Digit(int n) {
		if (n == 0) {
			return "";
		}

		String str = "";
		int div1000, mod1000;
		div1000 = n / 1000;
		mod1000 = n % 1000;

		if (div1000 == 1) {
			str += "seribu ";
		} else {
			str += convert1Digit(div1000) + "ribu ";
		}
		if (mod1000 > 0) {
			return (str + convert3Digit(mod1000));
		}
		return str;
	}
	private String convert5_6Digit(long n) {
		if (n == 0) {
			return "";
		}

		int div1000, mod1000;
		div1000 = (int) (n / 1000);
		mod1000 = (int) (n % 1000);

		if (div1000 == 0) {
			return convert3Digit(mod1000);
		}
		if (mod1000 > 0) {
			return (convert3Digit(div1000) + "ribu " + convert3Digit(mod1000));
		}
		return (convert3Digit(div1000) + "ribu ");
	}
	private String convert7_9Digit(long n) {
		if (n == 0) {
			return "";
		}

		int div1M 	= (int) (n / 1000000L);
		long mod1M 	=  n % 1000000L;

		if (div1M == 0) {
			return convert5_6Digit(mod1M);
		}
		if (mod1M > 0) {
			return (convert3Digit(div1M) + "juta " + convert5_6Digit(mod1M));
		}
		return (convert3Digit(div1M) + "juta ");
	}
	private String convert10_12Digit(long n) {
		if (n == 0) {
			return "";
		}

		int div1B 	= (int) (n / 1000000000L);
		long mod1B 	= n % 1000000000L;

		if (div1B == 0) {
			return convert7_9Digit(mod1B);
		}
		if (mod1B > 0) {
			return (convert3Digit(div1B) + "milyar " + convert7_9Digit(mod1B));
		}
		return (convert3Digit(div1B) + "milyar ");
	}
	private String convert13_15Digit(long n) {
		if (n == 0) {
			return "";
		}

		int div1T 	= (int) (n / 1000000000000L);
		long mod1T 	= n % 1000000000000L;

		if (div1T == 0) {
			return convert10_12Digit(mod1T);
		}
		if (mod1T > 0) {
			return (convert3Digit(div1T) + "trilyun " + convert10_12Digit(mod1T));
		}
		return (convert3Digit(div1T) + "trilyun ");
	}
	private String convert16_18Digit(long n) {
		if (n == 0) {
			return "";
		}

		int div1Q 	= (int) (n / 1000000000000000L);
		long mod1Q 	= n % 1000000000000000L;

		if (div1Q == 0) {
			return convert13_15Digit(mod1Q);
		}
		if (mod1Q > 0) {
			return (convert3Digit(div1Q) + "quadtrilyun " + convert13_15Digit(mod1Q));
		}
		return (convert3Digit(div1Q) + "quadtrilyun ");
	}
}
