/*
Persoalan :
	Bentuk air begantung terhadap suhu (t-temperature) sebagai berikut :
		t < 0		Berbentuk es / beku
		t = 0		Berbentuk tansisi es dan cair
		0 < t < 100	Berbentuk cair
		t = 100		Berbentuk transisi cair dan gas
		t > 100		Berbentuk gas / uap

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (Water) yang menyediakan layanan penentuan wujud air.
*/
package branching;

public class Water {
	// Atribut-atribut
	// Untuk mencatat temperatur dari air
	private final double temperature;

	// Creates a new instance of Water
	public Water(double temperature) {
		this.temperature = temperature;
	}
	public String getForm() {
		if (temperature < 0) {
			return "Es / beku";
		}
		if (temperature == 0) {
			return "Transisi es dan cair";
		}
		if (temperature > 0 && temperature < 100) {
			return "Cair";
		}
		if (temperature == 100) {
			return "Transisi cair dan gas";
		}
		if (temperature > 100) {
			return "Uap / gas";
		}
		// Bila pemrosesan telah dapat diselesaikan sedini mungkin kenapa kita mesti / harus berlama-lama berada didalam subrutin?
		return "";
		// Berarti begit, persoalan telah dapat diselesaikan maka segera saja diselesaikan, mengirim hasil dan keluar dari subrutin.
	}
	public String getWorseForm() {
		String str = "";
		if (temperature < 0) {
			str = "Es / beku";
		}
		else if (temperature == 0) {
			str = "Transisi es dan cair";
		}
		else if (temperature > 0 && temperature < 100) {
			str = "Cair";
		}
		else if (temperature == 100) {
			str = "Transisi cair dan gas";
		}
		else if (temperature > 100) {
			str = "Uap / gas";
		}
		return str;
	}
	public String getWorstForm() {
		String str = "";
		if (temperature < 0) {
			str = "Es / beku";
		} else {
			if (temperature == 0) {
				str = "Transisi es dan cair";
			} else {
				if (temperature > 0 && temperature < 10) {
					str = "Cair";
				} else {
					if (temperature == 100) {
						str = "Transisi cair dan gas";
					} else {
						if (temperature > 100) {
							str = "Uap / gas";
						}
					}					
				}
			}
		}
		return str;
	}
	@Override
	public String toString() {
		String str =
			"[String] Air bersuhu \t: " + temperature + " " + getForm();
		return str;
	}
	public String toWorseString() {
		String str = 
			"[Worse] Air bersuhu \t: " + temperature + " " + getWorseForm();
		return str;
	}
	public String toWorstString() {
		String str = 
			"[Worst] Air bersuhu \t: " + temperature + " " + getWorstForm();
		return str;
	}

	static void w01() {
		System.out.println(new Water(-10));
		System.out.println(new Water(0));
		System.out.println(new Water(10));
		System.out.println(new Water(100));
		System.out.println(new Water(110));
	}
	static void w02() {
		Water w = new Water(-10);
		System.out.println(w.toWorseString());
	}
	static void w03() {
		Water w = new Water(110);
		System.out.println(w.toWorseString());
	}
	static void space() {
		System.out.println();
	}
	static void userInterface() {
		w01();
		space();
		w02();
		space();
		w03();
		space();
	}

	public static void main(String[] args) {
		userInterface();
	}
}
