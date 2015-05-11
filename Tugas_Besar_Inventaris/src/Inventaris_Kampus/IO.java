package Inventaris_Kampus;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IO extends Super {
	    Scanner in = new Scanner(System.in);
	    Model call1;
	    Control z;
	    int a,b, steker=0, LCD=0, lampu=0, kipas= 0, AC=0, CCTV=0;
	    
	    public void input_identitas(){
	    	identitas();
	    }
	   
	   /*@Override
	    void setfile (String nama_ruang, String lokasi_ruang, String fakultas){
	    super.setfile(nama_ruang, lokasi_ruang, fakultas);
	    }*/
	    
	    public void input_kondisi_ruang_kelas(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela) {
	    	System.out.println('\n'+"-------------------- KONDISI RUANG KELAS ---------------------"+'\n');
	    	System.out.print("Masukkan panjang ruang         : ");
			panjang_ruang = in.nextInt();
			System.out.print("Masukkan lebar ruang           : ");
			lebar_ruang = in.nextInt();
			System.out.print("Masukkan jumlah kursi          : ");
			jumlah_kursi = in.nextInt();
			System.out.print("Masukkan jumlah pintu          : ");
			pintu = in.nextInt();
			System.out.print("Masukkan jumlah jendela        : ");
			jendela = in.nextInt();
		}
	    @Override
	    void setfile(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela){
	        setfile(panjang_ruang, lebar_ruang, jumlah_kursi, pintu, jendela);
	    }
	    
	    
	    public void kondisi_dan_posisi_sarana(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
	            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
	            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
	            int jumlah_AC, String kondisi_AC,String posisi_AC,String bandwidth, String login, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV) {
	    	System.out.println("\n----------- JUMLAH, KONDISI DAN POSISI RUANG KELAS -----------\n");
			System.out.print("Masukkan jumlah steker                   : ");
			jumlah_steker = in.nextInt();
			for(a=0; a <call1.getJml_steker(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Kondisi steker         [Rusak/Baik] : ");
				kondisi_steker = in.next();
				if(call1.getKondisi_steker().equalsIgnoreCase("baik")){
					steker++;
				}
			}
			JOptionPane.showMessageDialog(null, "PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
			System.out.print("Pilih posisi steker        [ketik huruf] : ");
			posisi_steker = in.next();                       
			
			
			System.out.print("\nJumlah kabel LCD                         : ");
			jumlah_kabel_LCD = in.nextInt();
			for(a=0; a <call1.getJml_kabel_LCD(); a++){
				b=a+1;
				System.out.print("  "+b+". Kondisi kabel LCD [Berfungsi/Rusak] : ");
				kondisi_kabel_LCD= in.next();
				if(call1.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")){
					LCD++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
			System.out.print("Pilih posisi kabel LCD     [ketik huruf] : ");
			posisi_kabel_LCD = in.next();
			
			
			System.out.print("\nMasukkan jumlah lampu                    : ");
			call1.setJml_lampu(in.nextInt());
			for(a=0; a <call1.getJml_lampu(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi lampu [Rusak/Baik] : ");
				kondisi_lampu = in.next();
				if(call1.getKondisi_lampu().equalsIgnoreCase("baik")){
					lampu++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi lampu         [ketik huruf] : ");
			posisi_lampu = in.next();
			
			
			System.out.print("\nMasukkan jumlah kipas                    : ");
			jumlah_kipas_angin = in.nextInt();
			for(a=0; a <call1.getJml_kipas_angin(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi kipas [Rusak/baik] : ");
				kondisi_kipas_angin = in.next();
				if(call1.getKondisi_kipas().equalsIgnoreCase("baik")){
					kipas++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi kipas         [ketik huruf] : ");
			posisi_kipas_angin = in.next();
			
			
			System.out.print("\nMasukkan jumlah AC                       : ");
			jumlah_AC = in.nextInt();
			for(a=0; a <call1.getJml_AC(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Masukkan kondisi AC    [Rusak/baik] : ");
				kondisi_AC = in.next();
				if(call1.getKondisi_AC().equalsIgnoreCase("baik")){
					AC++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
			System.out.print("Pilih posisi AC            [ketik huruf] : ");
			posisi_AC = in.next();
			
			JOptionPane.showMessageDialog(null,"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
			System.out.print("Pilih bandwidth(SSID)      [ketik huruf] : ");
			bandwidth = in.next();
			System.out.print("Login                       [Bisa/Tidak] : ");
			login = in.next();
			
			
			System.out.print("\nMasukkan jumlah CCTV                     : ");
			jumlah_CCTV = in.nextInt();
			for(a=0; a <call1.getJml_CCTV(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi CCTV  [Rusak/baik] : ");
				kondisi_CCTV = in.next();
				if(call1.getKondisi_CCTV().equalsIgnoreCase("baik")){
					CCTV++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
			System.out.print("Pilih posisi CCTV          [ketik huruf] : ");
			posisi_CCTV = in.next(); 
	    }
	    void setfile(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
	            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
	            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
	            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV){
	        setfile(jumlah_steker, kondisi_steker, posisi_steker, jumlah_kabel_LCD, kondisi_kabel_LCD, posisi_kabel_LCD, jumlah_lampu, kondisi_lampu, posisi_lampu, jumlah_kipas_angin, kondisi_kipas_angin, posisi_kipas_angin, jumlah_AC, kondisi_AC, posisi_AC, SSID, bandwidth, jumlah_CCTV, kondisi_CCTV, posisi_CCTV);
	    }
	    
	    
	    public void input_lingkungan_ruang_kelas(String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela) {
	    	System.out.println('\n'+"------------------- LINGKUNGAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null, "Masukkan Bersih atau kotor");
			System.out.print("Masukkan kondisi lantai        : ");
			kondisi_lantai = in.next();
			System.out.print("Masukkan kondisi dinding       : ");
			kondisi_dinding = in.next();
			System.out.print("Masukkan kondisi atap          : ");
			kondisi_atap = in.next();
			System.out.print("Masukkan kondisi pintu         : ");
			kondisi_pintu = in.next();
			System.out.print("Masukkan kondisi jendela       : ");
		}
	    @Override
	    void setfile(String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela){
	        setfile(kondisi_lantai, kondisi_dinding, kondisi_atap, kondisi_pintu, kondisi_jendela);
	    }
	    
	    
	    public void kebersihan_ruang_kelas(String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu) {
	    	System.out.println('\n'+"------------------- KEBERSIHAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null,"PILIHAN SIRKULASI UDARA"+'\n'+"a. Lancar"+'\n'+"b. Tidak Lancar");
			System.out.print("Masukkan sirkulasi udara       : ");
			sirkulasi_udara = in.nextLine();
			System.out.print("Masukkan nilai pencahayaan     : ");
			pencahayaan = in.nextInt();
			System.out.print("Masukkan kelembapan            : ");
			kelembapan = in.nextInt();
			System.out.print("Masukkan suhu [celcius]        : ");
			suhu = in.nextInt();
		}
	    @Override
	    void setfile(String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu){
	        setfile(sirkulasi_udara, pencahayaan, kelembapan, suhu);  
	    }
	    
	    
	    public void kenyamanan_ruang_kelas(int kebisingan, String bau, String kebocoran, String kerusakan, String keausan) {
	    	System.out.println('\n'+"------------------- KENYAMANAN RUANG KELAS -------------------"+'\n');
			System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
			kebisingan = in.nextInt();
			System.out.print("Masukkan bau           [Bau/Tidak] : ");
			bau = in.nextLine();
			System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
			kebocoran = in.nextLine();
			System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
			kerusakan = in.nextLine();
			System.out.print("Masukkan keausan       [Aus/tidak] : ");
			keausan = in.nextLine();
		}
	    @Override
	    void setfile (int kebisingan, String bau, String kebocoran, String kerusakan, String keausan){
	        setfile(kebisingan, bau, kebocoran, kerusakan, keausan);
	    }
	    
	    
	    public void keamanan_ruang(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya) {
	    	System.out.println('\n'+"-------------------- KEAMANAN RUANG KELAS --------------------"+'\n');
			JOptionPane.showMessageDialog(null, "Masukkan kokoh atau tidak");
			System.out.print("Masukkan kekokohan ruang       : ");
			kekokohan=in.next();
			System.out.print("jumlah kunci pintu             : ");
			jumlah_kunci=in.nextInt();
			System.out.print("jumlah jendela                 : ");
			jumlah_jendela= in.nextInt();
			JOptionPane.showMessageDialog(null, "Masukkan aman atau bahaya");
			System.out.print("Masukkan bahaya                : ");
			bahaya = in.next();
		}
	    void setfile(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya){
	        setfile(kekokohan, jumlah_kunci, jumlah_jendela, bahaya);
	    }
	    
	    
	    public void tampil (){
				System.out.println("Luas ruangan                    : "+z.hitung_luas());
				System.out.println("Bentuk Ruang                    : "+z.hitung_bentuk());
				if (z.hitung_rasio() >= 0.5) {
					System.out.println("Rasio Luas                      : "+ z.hitung_rasio() + " [Sesuai]");
				} else {
					System.out.println("Rasio Luas                      : "+z.hitung_rasio() + " [Tidak sesuai]");
				}
				System.out.println("Pintu dan Jendela               : "+z.analisis_pintu_dan_jendela());
				System.out.println("Kelistrikan                     : "+z.analisis_kelistrikan());
				System.out.println("LCD                             : "+z.analisis_LCD());
				System.out.println("Lampu                           : "+z.analisis_lampu());
				System.out.println("Kipas Angin                     : "+z.analisis_kipas_angin());
				System.out.println("AC                              : "+z.analisis_AC());
				System.out.println("Internet                        : "+z.analisis_internet());
				System.out.println("CCTV                            : "+z.analisis_CCTV());
				System.out.println("Kebersihan                      : "+z.analisis_kebersihan());
				System.out.println("Sirkulasi Udara                 : "+z.analisis_sirkulasi_udara());
				System.out.println("Pencahayaan                     : "+z.analisis_pencahayaan());
				System.out.println("Kelembapan                      : "+z.analisis_kelembapan());
				System.out.println("Suhu                            : "+z.analisis_suhu());
				System.out.println("Kebisingan                      : "+z.analisis_kebisingan());
				System.out.println("Bau                             : "+z.analisis_bau());
				System.out.println("Kebocoran                       : "+z.analisis_kebocoran());
				System.out.println("Kerusakan                       : "+z.analisis_kerusakan());
				System.out.println("Keausan                         : "+z.analisis_keausan());
				System.out.println("Kekokohan                       : "+z.analisis_kekokohan());
				System.out.println("Kunci Pintu dan Jendela         : "+z.analisis_kuncipintu_dan_jendela());
				System.out.println("keamanan Ruang                  : "+z.analisis_keamanan_ruang());
			}
	 public Model getModel(){
	        return call1;
	            }
}
