package Inventaris_Kampus;

public class Kondisi_ruang extends Model {
	String hasil;

	public void kondisi() {
		identitas();
		System.out.print("Masukkan panjang ruang         : ");
		setPanjang_ruang(in.nextDouble());
		System.out.print("Masukkan lebar ruang           : ");
		setLebar_ruang(in.nextDouble());
		System.out.print("Masukkan jumlah kursi          : ");
		setJml_kursi(in.nextInt());
		System.out.print("Masukkan jumlah pintu          : ");
		setJml_pintu(in.nextInt());
		System.out.print("Masukkan jumlah jendela        : ");
		setJml_jendela(in.nextInt());
	}

	String hitung_bentuk() {
		if (getPanjang_ruang() == getLebar_ruang()) {
			hasil = "Ruangan tidak sesuai";
		} else {
			hasil = "Ruangan sesuai";
		}
		return hasil;
	}

	double hitung_rasio() {
		return hitung_luas() / getJml_kursi();
	}

	String analisis_pintu_dan_jendela() {
		if (getJml_pintu() >= 2) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
