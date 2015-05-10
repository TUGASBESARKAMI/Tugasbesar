package Inventaris_Kampus;

public class Kebersihan_ruang extends Super {
	String hasil;
	Model call1= new Model();

	public void kebersihan() {
		identitas();
		System.out.print("Masukkan sirkulasi udara       : ");
		call1.setSirkulasi_udara(in.next());
		System.out.print("Masukkan nilai pencahayaan     : ");
		call1.setNilai_pencahayaan(in.nextFloat());
		System.out.print("Masukkan kelembapan            : ");
		call1.setKelembapan(in.nextFloat());
		System.out.print("Masukkan suhu [celcius]        : ");
		call1.setSuhu(in.nextFloat());
	}

	String analisis_sirkulasi_udara() {
		if (call1.getSirkulasi_udara().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_pencahayaan() {
		if (250 >= call1.getNilai_pencahayaan() && call1.getNilai_pencahayaan() >= 350) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kelembapan() {
		if (70 >= call1.getKelembapan() && call1.getKelembapan() <= 80) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_suhu() {
		if (25 >= call1.getKelembapan() && call1.getKelembapan() <= 35) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
