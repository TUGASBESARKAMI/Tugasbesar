package Inventaris_Kampus;

public class Lingkungan_ruang extends Model {
	String hasil;

	public void Lingkungan() {
		//identitas();
		System.out.print("Masukkan kondisi lantai   [Bersih/tidak] : ");
		setKondisi_lantai(in.next());
		System.out.print("Masukkan kondisi dinding  [Bersih/tidak] : ");
		setKondisi_dinding(in.next());
		System.out.print("Masukkan kondisi atap     [Bersih/tidak] : ");
		setKondisi_atap(in.next());
		System.out.print("Masukkan kondisi pintu    [Bersih/tidak] : ");
		setKondisi_pintu(in.next());
		System.out.print("Masukkan kondisi jendela  [Bersih/tidak] : ");
		setKondisi_jendela(in.next());
	}

	String analisis_kebersihan() {
		if (getKondisi_lantai().equalsIgnoreCase("bersih")
				&& getKondisi_dinding().equalsIgnoreCase("bersih")
				&& getKondisi_atap().equalsIgnoreCase("bersih")
				&& getKondisi_pintu().equalsIgnoreCase("bersih")
				&& getKondisi_jendela().equalsIgnoreCase("bersih")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
