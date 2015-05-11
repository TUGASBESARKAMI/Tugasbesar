package Inventaris_Kampus;

public abstract class Model {
	private String nama_ruang;
	private String lokasi_ruang;
	private String fakultas;
	private double panjang_ruang;
	private double lebar_ruang;
	private int jml_kursi;
	private int jml_pintu;
	private int jml_jendela;
	private int jml_steker;
	private String kondisi_steker;
	private String posisi_steker;
	private int jml_kabel_LCD;
	private String kondisi_kabel_LCD;
	private String posisi_kabel_LCD;
	private int jml_lampu;
	private String kondisi_lampu;
	private String posisi_lampu;
	private int jml_kipas_angin;
	private String kondisi_kipas;
	private String posisi_kipas;
	private int jml_AC;
	private String kondisi_AC;
	private String posisi_AC;
	private String bandwitdth;
	private String login;
	//private String SSID;
	private String bandwidth;
	private int jml_CCTV;
	private String kondisi_CCTV;
	private String posisi_CCTV;
	private String kondisi_lantai;
	private String kondisi_dinding;
	private String kondisi_atap;
	private String kondisi_pintu;
	private String kondisi_jendela;
	private String sirkulasi_udara;
	private int nilai_pencahayaan;
	private int kelembapan;
	private int suhu;
	private int kebisingan;
	private String bau;
	private String kebocoran;
	private String kerusakan;
	private String keausan;
	private String kekokohan;
	private String bahaya;
	private int jumlah_kunci;
	//private String kunci_pintujendela;
	

	public String getNama_ruang() {
		return nama_ruang;
	}

	public String getLokasi_ruang() {
		return lokasi_ruang;
	}

	public String getFakultas() {
		return fakultas;
	}

	public double getPanjang_ruang() {
		return panjang_ruang;
	}

	public double getLebar_ruang() {
		return lebar_ruang;
	}

	public int getJml_kursi() {
		return jml_kursi;
	}

	public int getJml_pintu() {
		return jml_pintu;
	}

	public int getJml_jendela() {
		return jml_jendela;
	}

	public int getJml_steker() {
		return jml_steker;
	}

	public String getKondisi_steker() {
		return kondisi_steker;
	}

	public String getPosisi_steker() {
		return posisi_steker;
	}

	public int getJml_kabel_LCD() {
		return jml_kabel_LCD;
	}

	public String getKondisi_kabel_LCD() {
		return kondisi_kabel_LCD;
	}

	public String getPosisi_kabel_LCD() {
		return posisi_kabel_LCD;
	}

	public int getJml_lampu() {
		return jml_lampu;
	}

	public String getKondisi_lampu() {
		return kondisi_lampu;
	}

	public String getPosisi_lampu() {
		return posisi_lampu;
	}

	public int getJml_kipas_angin() {
		return jml_kipas_angin;
	}

	public String getKondisi_kipas() {
		return kondisi_kipas;
	}

	public String getPosisi_kipas() {
		return posisi_kipas;
	}

	public int getJml_AC() {
		return jml_AC;
	}

	public String getKondisi_AC() {
		return kondisi_AC;
	}

	public String getPosisi_AC() {
		return posisi_AC;
	}

	public String getBandwitdth() {
		return bandwitdth;
	}

	public String getLogin() {
		return login;
	}

	public String getBandwidth() {
		return bandwidth;
	}

	public int getJml_CCTV() {
		return jml_CCTV;
	}

	public String getKondisi_CCTV() {
		return kondisi_CCTV;
	}

	public String getPosisi_CCTV() {
		return posisi_CCTV;
	}

	public String getKondisi_lantai() {
		return kondisi_lantai;
	}

	public String getKondisi_dinding() {
		return kondisi_dinding;
	}

	public String getKondisi_atap() {
		return kondisi_atap;
	}

	public String getKondisi_pintu() {
		return kondisi_pintu;
	}

	public String getKondisi_jendela() {
		return kondisi_jendela;
	}

	public String getSirkulasi_udara() {
		return sirkulasi_udara;
	}

	public int getNilai_pencahayaan() {
		return nilai_pencahayaan;
	}

	public int getKelembapan() {
		return kelembapan;
	}

	public int getSuhu() {
		return suhu;
	}

	public int getKebisingan() {
		return kebisingan;
	}

	public String getBau() {
		return bau;
	}

	public String getKebocoran() {
		return kebocoran;
	}

	public String getKerusakan() {
		return kerusakan;
	}

	public String getKeausan() {
		return keausan;
	}

	public String getKekokohan() {
		return kekokohan;
	}

	public String getBahaya() {
		return bahaya;
	}

	public void setNama_ruang(String nama_ruang) {
		this.nama_ruang = nama_ruang;
	}

	public void setLokasi_ruang(String lokasi_ruang) {
		this.lokasi_ruang = lokasi_ruang;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	public void setPanjang_ruang(int panjang_ruang) {
		this.panjang_ruang = panjang_ruang;
	}

	public void setLebar_ruang(int lebar_ruang) {
		this.lebar_ruang = lebar_ruang;
	}

	public void setJml_kursi(int jml_kursi) {
		this.jml_kursi = jml_kursi;
	}

	public void setJml_pintu(int jml_pintu) {
		this.jml_pintu = jml_pintu;
	}

	public void setJml_jendela(int jml_jendela) {
		this.jml_jendela = jml_jendela;
	}

	public void setJml_steker(int jml_steker) {
		this.jml_steker = jml_steker;
	}

	public void setKondisi_steker(String kondisi_steker) {
		this.kondisi_steker = kondisi_steker;
	}

	public void setPosisi_steker(String posisi_steker) {
		this.posisi_steker = posisi_steker;
	}

	public void setJml_kabel_LCD(int jml_kabel_LCD) {
		this.jml_kabel_LCD = jml_kabel_LCD;
	}

	public void setKondisi_kabel_LCD(String kondisi_kabel_LCD) {
		this.kondisi_kabel_LCD = kondisi_kabel_LCD;
	}

	public void setPosisi_kabel_LCD(String posisi_kabel_LCD) {
		this.posisi_kabel_LCD = posisi_kabel_LCD;
	}

	public void setJml_lampu(int jml_lampu) {
		this.jml_lampu = jml_lampu;
	}

	public void setKondisi_lampu(String kondisi_lampu) {
		this.kondisi_lampu = kondisi_lampu;
	}

	public void setPosisi_lampu(String posisi_lampu) {
		this.posisi_lampu = posisi_lampu;
	}

	public void setJml_kipas_angin(int jml_kipas_angin) {
		this.jml_kipas_angin = jml_kipas_angin;
	}

	public void setKondisi_kipas(String kondisi_kipas) {
		this.kondisi_kipas = kondisi_kipas;
	}

	public void setPosisi_kipas(String posisi_kipas) {
		this.posisi_kipas = posisi_kipas;
	}

	public void setJml_AC(int jml_AC) {
		this.jml_AC = jml_AC;
	}

	public void setKondisi_AC(String kondisi_AC) {
		this.kondisi_AC = kondisi_AC;
	}

	public void setPosisi_AC(String posisi_AC) {
		this.posisi_AC = posisi_AC;
	}

	public void setBandwitdth(String bandwitdth) {
		this.bandwitdth = bandwitdth;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public void setJml_CCTV(int jml_CCTV) {
		this.jml_CCTV = jml_CCTV;
	}

	public void setKondisi_CCTV(String kondisi_CCTV) {
		this.kondisi_CCTV = kondisi_CCTV;
	}

	public void setPosisi_CCTV(String posisi_CCTV) {
		this.posisi_CCTV = posisi_CCTV;
	}

	public void setKondisi_lantai(String kondisi_lantai) {
		this.kondisi_lantai = kondisi_lantai;
	}

	public void setKondisi_dinding(String kondisi_dinding) {
		this.kondisi_dinding = kondisi_dinding;
	}

	public void setKondisi_atap(String kondisi_atap) {
		this.kondisi_atap = kondisi_atap;
	}

	public void setKondisi_pintu(String kondisi_pintu) {
		this.kondisi_pintu = kondisi_pintu;
	}

	public void setKondisi_jendela(String kondisi_jendela) {
		this.kondisi_jendela = kondisi_jendela;
	}

	public void setSirkulasi_udara(String sirkulasi_udara) {
		this.sirkulasi_udara = sirkulasi_udara;
	}

	public void setNilai_pencahayaan(int nilai_pencahayaan) {
		this.nilai_pencahayaan = nilai_pencahayaan;
	}

	public void setKelembapan(int kelembapan) {
		this.kelembapan = kelembapan;
	}

	public void setSuhu(int suhu) {
		this.suhu = suhu;
	}

	public void setKebisingan(int kebisingan) {
		this.kebisingan = kebisingan;
	}

	public void setBau(String bau) {
		this.bau = bau;
	}

	public void setKebocoran(String kebocoran) {
		this.kebocoran = kebocoran;
	}

	public void setKerusakan(String kerusakan) {
		this.kerusakan = kerusakan;
	}

	public void setKeausan(String keausan) {
		this.keausan = keausan;
	}

	public void setKekokohan(String kekokohan) {
		this.kekokohan = kekokohan;
	}

	public void setBahaya(String bahaya) {
		this.bahaya = bahaya;
	}
	
	/*void setfile(String nama_ruang, String lokasi_ruang, String fakultas) {
		this.nama_ruang = nama_ruang;
		this.lokasi_ruang = lokasi_ruang;
		this.fakultas = fakultas;
	}*/

	void setfile(int panjang_ruang, int lebar_ruang, int jumlah_kursi,
			int pintu, int jendela) {
		this.panjang_ruang = panjang_ruang;
		this.lebar_ruang = lebar_ruang;
		this.jml_kursi = jumlah_kursi;
		this.jml_pintu = pintu;
		this.jml_jendela = jendela;
	}

	void setfile(int jumlah_steker, String kondisi_steker,
			String posisi_steker, int jumlah_kabel_LCD,
			String kondisi_kabel_LCD, String posisi_kabel_LCD,
			int jumlah_lampu, String kondisi_lampu, String posisi_lampu,
			int jumlah_kipas_angin, String kondisi_kipas_angin,
			String posisi_kipas_angin, int jumlah_AC, String kondisi_AC,
			String posisi_AC, String login, String bandwidth, int jumlah_CCTV,
			String kondisi_CCTV, String posisi_CCTV) {
		this.jml_steker = jumlah_steker;
		this.kondisi_steker = kondisi_steker;
		this.posisi_steker = posisi_steker;
		this.jml_kabel_LCD = jumlah_kabel_LCD;
		this.kondisi_kabel_LCD = kondisi_kabel_LCD;
		this.posisi_kabel_LCD = posisi_kabel_LCD;
		this.jml_lampu = jumlah_lampu;
		this.kondisi_lampu = kondisi_lampu;
		this.posisi_lampu = posisi_lampu;
		this.jml_kipas_angin = jumlah_kipas_angin;
		this.kondisi_kipas = kondisi_kipas_angin;
		this.posisi_kipas = posisi_kipas_angin;
		this.jml_AC = jumlah_AC;
		this.kondisi_AC = kondisi_AC;
		this.posisi_AC = posisi_AC;
		this.login = login;
		this.bandwidth = bandwidth;
		//this.SSID = SSID;
		this.bandwidth = bandwidth;
		this.jml_CCTV = jumlah_CCTV;
		this.kondisi_CCTV = kondisi_CCTV;
		this.posisi_CCTV = posisi_CCTV;
	}

	void setfile(String kondisi_lantai, String kondisi_dinding,
			String kondisi_atap, String kondisi_pintu, String kondisi_jendela) {
		this.kondisi_lantai = kondisi_lantai;
		this.kondisi_dinding = kondisi_dinding;
		this.kondisi_atap = kondisi_atap;
		this.kondisi_pintu = kondisi_pintu;
		this.kondisi_jendela = kondisi_jendela;
	}

	void setfile(String sirkulasi_udara, int pencahayaan, int kelembapan,
			int suhu) {
		this.sirkulasi_udara = sirkulasi_udara;
		this.nilai_pencahayaan = pencahayaan;
		this.kelembapan = kelembapan;
		this.suhu = suhu;
	}

	void setfile(int kebisingan, String bau, String kebocoran,
			String kerusakan, String keausan) {
		this.kebisingan = kebisingan;
		this.bau = bau;
		this.kebocoran = kebocoran;
		this.kerusakan = kerusakan;
		this.keausan = keausan;
	}

	void setfile(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya) {
		this.kekokohan = kekokohan;
		this.jumlah_kunci = jumlah_kunci;
		this.jml_jendela = jumlah_jendela;
		this.bahaya = bahaya;
	}

	public Model() {
	}

	public int getJumlah_kunci() {
		return jumlah_kunci;
	}

	public void setJumlah_kunci(int jumlah_kunci) {
		this.jumlah_kunci = jumlah_kunci;
	}
}