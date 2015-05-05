package Inventaris_Kampus;

import java.util.Scanner;

public class Tampil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kondisi_ruang call1 = new Kondisi_ruang();
		Jml_kondisi_dan_posisi call2 = new Jml_kondisi_dan_posisi();
		Lingkungan_ruang call3 = new Lingkungan_ruang();
		Kebersihan_ruang call4 = new Kebersihan_ruang();
		Kenyamanan_ruang call5 = new Kenyamanan_ruang();
		Keamanan_ruang call6 = new Keamanan_ruang();

		System.out
				.println("==============================================================");
		System.out.println("                      INVENTARIS KAMPUS");
		System.out
				.println("==============================================================");
		call1.kondisi();
		call2.jml_kondisi_dan_posisi();
		call3.Lingkungan();
		call4.kebersihan();
		call5.kenyamanan();
		call6.keamanan();
		System.out
				.println("\n========================HASIL ANALISIS========================");
		System.out.println("Luas ruangan                    : "
				+ call1.hitung_luas());
		System.out.println("Bentuk Ruang                    : "
				+ call1.hitung_bentuk());
		if (call1.hitung_rasio() >= 0.5) {
			System.out.println("Rasio Luas                      : "
					+ call1.hitung_rasio() + " [Sesuai]");
		} else {
			System.out.println("Rasio Luas                      : "
					+ call1.hitung_rasio() + " [Tidak sesuai]");
		}
		System.out.println("Pintu dan Jendela               : "
				+ call1.analisis_pintu_dan_jendela());
		System.out.println("Kelistrikan                     : "
				+ call2.analisis_kelistrikan());
		System.out.println("LCD                             : "
				+ call2.analisis_LCD());
		System.out.println("Lampu                           : "
				+ call2.analisis_lampu());
		System.out.println("Kipas Angin                     : "
				+ call2.analisis_kipas_angin());
		System.out.println("AC                              : "
				+ call2.analisis_AC());
		System.out.println("Internet                        : "
				+ call2.analisis_internet());
		System.out.println("CCTV                            : "
				+ call2.analisis_CCTV());
		System.out.println("Kebersihan                      : "
				+ call3.analisis_kebersihan());
		System.out.println("Sirkulasi Udara                 : "
				+ call4.analisis_sirkulasi_udara());
		System.out.println("Pencahayaan                     : "
				+ call4.analisis_pencahayaan());
		System.out.println("Kelembapan                      : "
				+ call4.analisis_kelembapan());
		System.out.println("Suhu                            : "
				+ call4.analisis_suhu());
		System.out.println("Kebisingan                      : "
				+ call5.analisis_kebisingan());
		System.out.println("Bau                             : "
				+ call5.analisis_bau());
		System.out.println("Kebocoran                       : "
				+ call5.analisis_kebocoran());
		System.out.println("Kerusakan                       : "
				+ call5.analisis_kerusakan());
		System.out.println("Keausan                         : "
				+ call5.analisis_keausan());
		System.out.println("Kekokohan                       : "
				+ call6.analisis_kekokohan());
		System.out.println("Kunci Pintu dan Jendela         : "
				+ call6.analisis_kuncipintu_dan_jendela());
		System.out.println("keamanan Ruang                  : "
				+ call6.analisis_keamanan_ruang());

		System.out
				.println("==============================================================");
	}
}
