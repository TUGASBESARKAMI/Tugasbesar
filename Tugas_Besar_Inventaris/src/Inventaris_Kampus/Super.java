package Inventaris_Kampus;

import java.util.Scanner;

public class Super {
	Model call = new Model();
	Scanner in = new Scanner(System.in);
	
	void identitas() {
		System.out.print("Masukkan nama ruang            : ");
		call.setNama_ruang(in.next());
		System.out.print("Masukkan lokasi ruang          : ");
		call.setLokasi_ruang(in.next());
		System.out.print("Masukkan fakultas              : ");
		call.setFakultas(in.next());
	}
}
