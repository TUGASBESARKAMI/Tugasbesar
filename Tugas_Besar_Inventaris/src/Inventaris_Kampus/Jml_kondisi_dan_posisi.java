package Inventaris_Kampus;

import javax.swing.JOptionPane;

public class Jml_kondisi_dan_posisi extends Super {
	Model call1= new Model();
	int a, b, steker = 0, LCD = 0, lampu = 0, kipas = 0, AC = 0, CCTV = 0;
	String hasil;

	public void jml_kondisi_dan_posisi() {
		identitas();
		System.out.print("Masukkan jumlah steker                   : ");
		call1.setJml_steker(in.nextInt());
		for (a = 0; a < call1.getJml_steker(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Kondisi steker         [Rusak/Baik] : ");
			call1.setKondisi_steker(in.next());
			if (call1.getKondisi_steker().equalsIgnoreCase("baik")) {
				steker++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
		System.out.print("Pilih posisi steker        [ketik huruf] : ");
		call1.setPosisi_steker(in.next());

		System.out.print("\nJumlah kabel LCD                         : ");
		call1.setJml_kabelLCD(in.nextInt());
		for (a = 0; a < call1.getJml_kabelLCD(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Kondisi kabel LCD [Berfungsi/Rusak] : ");
			call1.setKondisi_kabelLCD(in.next());
			if (call1.getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")) {
				LCD++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
		System.out.print("Pilih posisi kabel LCD     [ketik huruf] : ");
		call1.setPosisi_kabelLCD(in.next());

		System.out.print("\nMasukkan jumlah lampu                    : ");
		call1.setJml_lampu(in.nextInt());
		for (a = 0; a < call1.getJml_lampu(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi lampu [Rusak/Baik] : ");
			call1.setKondisi_lampu(in.next());
			if (call1.getKondisi_lampu().equalsIgnoreCase("baik")) {
				lampu++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi lampu         [ketik huruf] : ");
		call1.setPosisi_lampu(in.next());

		System.out.print("\nMasukkan jumlah kipas                    : ");
		call1.setJml_kipas(in.nextInt());
		for (a = 0; a < call1.getJml_kipas(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi kipas [Rusak/baik] : ");
			call1.setKondisi_kipas(in.next());
			if (call1.getKondisi_kipas().equalsIgnoreCase("baik")) {
				kipas++;
			}
		}
		JOptionPane
				.showMessageDialog(
						null,
						"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi kipas         [ketik huruf] : ");
		call1.setPosisi_kipas(in.next());

		System.out.print("\nMasukkan jumlah AC                       : ");
		call1.setJml_AC(in.nextInt());
		for (a = 0; a < call1.getJml_AC(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi AC    [Rusak/baik] : ");
			call1.setKondisi_AC(in.next());
			if (call1.getKondisi_AC().equalsIgnoreCase("baik")) {
				AC++;
			}
		}
		JOptionPane
				.showMessageDialog(null,
						"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
		System.out.print("Pilih posisi AC            [ketik huruf] : ");
		call1.setPosisi_AC(in.next());

		JOptionPane.showMessageDialog(null,
				"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
		System.out.print("Pilih bandwidth(SSID)      [ketik huruf] : ");
		call1.setBandwitdth(in.next());
		System.out.print("Login                       [Bisa/Tidak] : ");
		call1.setLogin(in.next());

		System.out.print("\nMasukkan jumlah CCTV                     : ");
		call1.setJml_CCTV(in.nextInt());
		for (a = 0; a < call1.getJml_CCTV(); a++) {
			b = a + 1;
			System.out.print("  " + b
					+ ". Masukkan kondisi CCTV  [Rusak/baik] : ");
			call1.setKondisi_CCTV(in.next());
			if (call1.getKondisi_CCTV().equalsIgnoreCase("baik")) {
				CCTV++;
			}
		}
		JOptionPane
				.showMessageDialog(null,
						"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
		System.out.print("Pilih posisi CCTV          [ketik huruf] : ");
		call1.setPosisi_CCTV(in.next());
	}

	String analisis_kelistrikan() {
		if (call1.getPosisi_steker().equalsIgnoreCase("a") && call1.getJml_steker() >= 4
				&& steker == 4) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_LCD() {
		if (call1.getJml_kabelLCD() >= 1
				&& call1.getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")
				&& call1.getPosisi_kabelLCD().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_lampu() {
		if (call1.getJml_lampu() >= 18 && lampu == 18
				&& call1.getPosisi_lampu().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_kipas_angin() {
		if (call1.getJml_kipas() >= 2 && kipas == 2
				&& call1.getPosisi_kipas().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_AC() {
		if (call1.getJml_AC() >= 1 && AC >= 1 && call1.getPosisi_AC().equalsIgnoreCase("a")
				&& call1.getPosisi_AC().equalsIgnoreCase("b")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_internet() {
		if (call1.getBandwitdth().equalsIgnoreCase("a")
				&& call1.getLogin().equalsIgnoreCase("baik")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}

	String analisis_CCTV() {
		if (call1.getJml_CCTV() == 2 && CCTV == 2
				&& call1.getPosisi_CCTV().equalsIgnoreCase("a")) {
			hasil = "Sesuai";
		} else {
			hasil = "Tidak sesuai";
		}
		return hasil;
	}
}
