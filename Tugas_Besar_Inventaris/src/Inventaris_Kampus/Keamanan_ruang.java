package Inventaris_Kampus;

public class Keamanan_ruang extends Super {
	String hasil;
	Model call1= new Model();

	public void keamanan() {
		identitas();
		System.out.print("Masukkan kekokohan ruang        [Kokoh/Tidak] : ");
		call1.setKekokohan(in.next());
		System.out.print("Masukkan kunci pintu & jendela    [Ada/Tidak] : ");
		call1.setKunci_pintujendela(in.next());
		System.out.print("Masukkan bahaya                  [Aman/Tidak] : ");
		call1.setBahaya(in.next());
	}

	String analisis_kekokohan() {
		if (call1.getKekokohan().equalsIgnoreCase("kokoh")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kuncipintu_dan_jendela() {
		if (call1.getKunci_pintujendela().equalsIgnoreCase("ada")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_keamanan_ruang() {
		if (call1.getBahaya().equalsIgnoreCase("aman")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
