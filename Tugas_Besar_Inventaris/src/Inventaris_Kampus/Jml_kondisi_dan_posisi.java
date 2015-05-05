package Inventaris_Kampus;

import javax.swing.JOptionPane;

public class Jml_kondisi_dan_posisi extends Model {

	int a, b, steker = 0, LCD = 0, lampu = 0, kipas = 0, AC = 0, CCTV = 0;
	String hasil;

	public void jml_kondisi_dan_posisi() {
		//identitas();
		System.out.print("Masukkan jumlah steker                   : ");
		setJml_steker(in.nextInt());
		for (a = 0; a < getJml_steker(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Kondisi steker         [Rusak/Baik] : ");
			setKondisi_steker(in.next());
			if (getKondisi_steker().equalsIgnoreCase("baik")) {
				steker++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
		System.out.print("Pilih posisi steker        [ketik huruf] : ");
		setPosisi_steker(in.next());

		System.out.print("\nJumlah kabel LCD                         : ");
		setJml_kabelLCD(in.nextInt());
		for (a = 0; a < getJml_kabelLCD(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Kondisi kabel LCD [Berfungsi/Rusak] : ");
			setKondisi_kabelLCD(in.next());
			if (getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")) {
				LCD++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
		System.out.print("Pilih posisi kabel LCD     [ketik huruf] : ");
		setPosisi_kabelLCD(in.next());

		System.out.print("\nMasukkan jumlah lampu                    : ");
		setJml_lampu(in.nextInt());
		for (a = 0; a < getJml_lampu(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi lampu [Rusak/Baik] : ");
			setKondisi_lampu(in.next());
			if (getKondisi_lampu().equalsIgnoreCase("baik")) {
				lampu++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi lampu         [ketik huruf] : ");
		setPosisi_lampu(in.next());

		System.out.print("\nMasukkan jumlah kipas                    : ");
		setJml_kipas(in.nextInt());
		for (a = 0; a < getJml_kipas(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi kipas [Rusak/baik] : ");
			setKondisi_kipas(in.next());
			if (getKondisi_kipas().equalsIgnoreCase("baik")) {
				kipas++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi kipas         [ketik huruf] : ");
		setPosisi_kipas(in.next());

		System.out.print("\nMasukkan jumlah AC                       : ");
		setJml_AC(in.nextInt());
		for (a = 0; a < getJml_AC(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi AC    [Rusak/baik] : ");
			setKondisi_AC(in.next());
			if (getKondisi_AC().equalsIgnoreCase("baik")) {
				AC++;
			}
		}
		JOptionPane
				.showMessageDialog(null,
						"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
		System.out.print("Pilih posisi AC            [ketik huruf] : ");
		setPosisi_AC(in.next());

		JOptionPane.showMessageDialog(null,
				"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
		System.out.print("Pilih bandwidth(SSID)      [ketik huruf] : ");
		setBandwitdth(in.next());
		System.out.print("Login                       [Bisa/Tidak] : ");
		setLogin(in.next());

		System.out.print("\nMasukkan jumlah CCTV                     : ");
		setJml_CCTV(in.nextInt());
		for (a = 0; a < getJml_CCTV(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi CCTV  [Rusak/baik] : ");
			setKondisi_CCTV(in.next());
			if (getKondisi_CCTV().equalsIgnoreCase("baik")) {
				CCTV++;
			}
		}
		JOptionPane
				.showMessageDialog(null,
						"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
		System.out.print("Pilih posisi CCTV          [ketik huruf] : ");
		setPosisi_CCTV(in.next());
	}

	String analisis_kelistrikan() {
		if (getPosisi_steker().equalsIgnoreCase("a") && getJml_steker() >= 4
				&& steker == 4) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_LCD() {
		if (getJml_kabelLCD() >= 1
				&& getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")
				&& getPosisi_kabelLCD().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_lampu() {
		if (getJml_lampu() >= 18 && lampu == 18
				&& getPosisi_lampu().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kipas_angin() {
		if (getJml_kipas() >= 2 && kipas == 2
				&& getPosisi_kipas().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_AC() {
		if (getJml_AC() >= 1 && AC >= 1 && getPosisi_AC().equalsIgnoreCase("a")
				&& getPosisi_AC().equalsIgnoreCase("b")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_internet() {
		if (getBandwitdth().equalsIgnoreCase("a")
				&& getLogin().equalsIgnoreCase("baik")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_CCTV() {
		if (getJml_CCTV() == 2 && CCTV == 2
				&& getPosisi_CCTV().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
