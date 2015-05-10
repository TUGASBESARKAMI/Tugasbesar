package Inventaris_Kampus;

public class Lingkungan_ruang extends Super {
	String hasil;
	Model call1= new Model();

	public void Lingkungan() {
		identitas();
		System.out.print("Masukkan kondisi lantai   [Bersih/tidak] : ");
		call1.setKondisi_lantai(in.next());
		System.out.print("Masukkan kondisi dinding  [Bersih/tidak] : ");
		call1.setKondisi_dinding(in.next());
		System.out.print("Masukkan kondisi atap     [Bersih/tidak] : ");
		call1.setKondisi_atap(in.next());
		System.out.print("Masukkan kondisi pintu    [Bersih/tidak] : ");
		call1.setKondisi_pintu(in.next());
		System.out.print("Masukkan kondisi jendela  [Bersih/tidak] : ");
		call1.setKondisi_jendela(in.next());
	}

	String analisis_kebersihan() {
		if (call1.getKondisi_lantai().equalsIgnoreCase("bersih")
				&& call1.getKondisi_dinding().equalsIgnoreCase("bersih")
				&& call1.getKondisi_atap().equalsIgnoreCase("bersih")
				&& call1.getKondisi_pintu().equalsIgnoreCase("bersih")
				&& call1.getKondisi_jendela().equalsIgnoreCase("bersih")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
