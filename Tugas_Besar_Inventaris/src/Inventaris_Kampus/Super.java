package Inventaris_Kampus;

import java.util.Scanner;

public class Super extends Model {
	Scanner in = new Scanner(System.in);
	void identitas(){
		System.out.println('\n'+"------------------- IDENTITAS RUANG KELAS --------------------"+'\n');
		System.out.print("Masukkan nama ruang            : ");
		setNama_ruang(in.next());
		System.out.print("Masukkan lokasi ruang          : ");
		setLokasi_ruang(in.next());
		System.out.print("Masukkan fakultas              : ");
		setFakultas(in.next());
	}
}
