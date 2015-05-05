package Inventaris_Kampus;

public class Keamanan_ruang extends Model {
	String hasil;

	public void keamanan() {
		//identitas();
		System.out.print("Masukkan kekokohan ruang        [Kokoh/Tidak] : ");
		setKekokohan(in.next());
		System.out.print("Masukkan kunci pintu & jendela    [Ada/Tidak] : ");
		setKunci_pintujendela(in.next());
		System.out.print("Masukkan bahaya                  [Aman/Tidak] : ");
		setBahaya(in.next());
	}

	String analisis_kekokohan() {
		if (getKekokohan().equalsIgnoreCase("kokoh")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kuncipintu_dan_jendela() {
		if (getKunci_pintujendela().equalsIgnoreCase("ada")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_keamanan_ruang() {
		if (getBahaya().equalsIgnoreCase("aman")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
