package Inventaris_Kampus;

public class Kenyamanan_ruang extends Super {
	String hasil;
	Model call1= new Model();
	
	public void kenyamanan() {
		identitas();
		System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
		call1.setKebisingan(in.next());
		System.out.print("Masukkan bau           [Bau/Tidak] : ");
		call1.setBau(in.next());
		System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
		call1.setKebocoran(in.next());
		System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
		call1.setKerusakan(in.next());
		System.out.print("Masukkan keausan       [Aus/tidak] : ");
		call1.setKeausan(in.next());
	}

	String analisis_kebisingan() {
		if (call1.getKebisingan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_bau() {
		if (call1.getBau().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kebocoran() {
		if (call1.getKebocoran().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kerusakan() {
		if (call1.getKerusakan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_keausan() {
		if (call1.getKeausan().equalsIgnoreCase("tidak")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
