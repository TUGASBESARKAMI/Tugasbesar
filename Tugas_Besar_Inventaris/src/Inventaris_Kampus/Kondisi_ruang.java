package Inventaris_Kampus;

public class Kondisi_ruang extends Super {
	String hasil;
	Model call1= new Model();

	public void kondisi() {
		identitas();
		System.out.print("Masukkan panjang ruang         : ");
		call1.setPanjang_ruang(in.nextDouble());
		System.out.print("Masukkan lebar ruang           : ");
		call1.setLebar_ruang(in.nextDouble());
		System.out.print("Masukkan jumlah kursi          : ");
		call1.setJml_kursi(in.nextInt());
		System.out.print("Masukkan jumlah pintu          : ");
		call1.setJml_pintu(in.nextInt());
		System.out.print("Masukkan jumlah jendela        : ");
		call1.setJml_jendela(in.nextInt());
	}

	String hitung_bentuk() {
		if (call1.getPanjang_ruang() == call1.getLebar_ruang()) {
			hasil = "Ruangan tidak sesuai";
		} else {
			hasil = "Ruangan sesuai";
		}
		return hasil;
	}

	double hitung_luas() {
		return call1.getPanjang_ruang() * call1.getLebar_ruang();
	}
	
	double hitung_rasio() {
		return hitung_luas() / call1.getJml_kursi();
	}

	String analisis_pintu_dan_jendela() {
		if (call1.getJml_pintu() >= 2) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
