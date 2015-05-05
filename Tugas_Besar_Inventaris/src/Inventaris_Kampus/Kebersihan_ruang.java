package Inventaris_Kampus;

public class Kebersihan_ruang extends Model {
	String hasil;

	public void kebersihan() {
		identitas();
		System.out.print("Masukkan sirkulasi udara       : ");
		setSirkulasi_udara(in.next());
		System.out.print("Masukkan nilai pencahayaan     : ");
		setNilai_pencahayaan(in.nextFloat());
		System.out.print("Masukkan kelembapan            : ");
		setKelembapan(in.nextFloat());
		System.out.print("Masukkan suhu [celcius]        : ");
		setSuhu(in.nextFloat());
	}

	String analisis_sirkulasi_udara() {
		if (getSirkulasi_udara().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_pencahayaan() {
		if (250 >= getNilai_pencahayaan() && getNilai_pencahayaan() >= 350) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kelembapan() {
		if (70 >= getKelembapan() && getKelembapan() <= 80) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_suhu() {
		if (25 >= getKelembapan() && getKelembapan() <= 35) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
