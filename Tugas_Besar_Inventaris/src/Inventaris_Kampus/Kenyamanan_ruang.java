package Inventaris_Kampus;

public class Kenyamanan_ruang extends Model {
	String hasil;

	public void kenyamanan() {
		//identitas();
		System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
		setKebisingan(in.next());
		System.out.print("Masukkan bau           [Bau/Tidak] : ");
		setBau(in.next());
		System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
		setKebocoran(in.next());
		System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
		setKerusakan(in.next());
		System.out.print("Masukkan keausan       [Aus/tidak] : ");
		setKeausan(in.next());
	}

	String analisis_kebisingan() {
		if (getKebisingan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_bau() {
		if (getBau().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kebocoran() {
		if (getKebocoran().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kerusakan() {
		if (getKerusakan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_keausan() {
		if (getKeausan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
