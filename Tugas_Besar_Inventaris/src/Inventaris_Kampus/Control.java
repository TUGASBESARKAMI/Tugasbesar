package Inventaris_Kampus;

import java.util.Scanner;

public abstract class Control extends IO{
	    Model call1 = new Model() {};
	    Scanner in = new Scanner(System.in);
	    String hasil;
	    int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
	    
	    public  void analisis_hitung_ruang (){
	    }
	    
	    double hitung_luas() {
			return call1.getPanjang_ruang() * call1.getLebar_ruang();
		}

		String hitung_bentuk() {
			if (call1.getPanjang_ruang() == call1.getLebar_ruang()){
				hasil = "Ruangan tidak sesuai";
			}else{
				hasil = "Ruangan sesuai";
			}
			return hasil;
		}

		double hitung_rasio() {
			return hitung_luas() / call1.getJml_kursi();
		}

		String analisis_pintu_dan_jendela() {
			if (call1.getJml_pintu() >= 2) {
				hasil ="Sesuai";
			} else {
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_kelistrikan(){
			if(call1.getPosisi_steker().equalsIgnoreCase("a") && call1.getJml_steker() >= 4 && steker == 4 ){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_LCD(){
			if(call1.getJml_kabel_LCD() >= 1 && call1.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi") && call1.getPosisi_kabel_LCD().equalsIgnoreCase("a")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_lampu(){
			if(call1.getJml_lampu() >= 18 && lampu == 18 && call1.getPosisi_lampu().equalsIgnoreCase("a")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_kipas_angin(){
			if(call1.getJml_kipas_angin() >= 2 && kipas ==2 && call1.getPosisi_kipas().equalsIgnoreCase("a") ){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_AC(){
			if(call1.getJml_AC() >= 1 && AC>=1 && call1.getPosisi_AC().equalsIgnoreCase("a") && call1.getPosisi_AC().equalsIgnoreCase("b")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_internet(){
			if(call1.getBandwitdth().equalsIgnoreCase("a") && call1.getLogin().equalsIgnoreCase("baik")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_CCTV(){
			if(call1.getJml_CCTV() == 2 && CCTV==2 && call1.getPosisi_CCTV().equalsIgnoreCase("a")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
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
		
		String analisis_sirkulasi_udara(){
			if(call1.getSirkulasi_udara().equalsIgnoreCase("a")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_pencahayaan(){
			if(250>=call1.getNilai_pencahayaan() && call1.getNilai_pencahayaan()>=350){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_kelembapan(){
			if(70>=call1.getKelembapan() && call1.getKelembapan()<=80){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_suhu(){
			if(25>=call1.getKelembapan() && call1.getKelembapan()<=35){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		public String analisis_kebisingan() {
			if ("tidak bising".equals(call1.getKebisingan())) {
				hasil="Sesuai";
			} else {
				hasil="tidak sesuai";
			}return hasil;
		}
		
		String analisis_bau(){
			if(call1.getBau().equalsIgnoreCase("tidak")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_kebocoran(){
			if(call1.getKebocoran().equalsIgnoreCase("tidak")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_kerusakan(){
			if(call1.getKerusakan().equalsIgnoreCase("tidak")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
		}
		
		String analisis_keausan(){
			if(call1.getKeausan().equalsIgnoreCase("tidak")){
				hasil = "Sesuai";
			}else{
				hasil = "Tidak sesuai";
			}
			return hasil;
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
			if (call1.getJumlah_kunci() != 0 && call1.getJml_jendela() != 0) {
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
