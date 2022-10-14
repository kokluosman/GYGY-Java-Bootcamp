package Assignment5;

public class OgretimGorevlisi extends Akademisyen{

	public OgretimGorevlisi(String ad, String soyad, String email, String bolum, String unvan, String kapiNo) {
		super(ad, soyad, email, bolum, unvan);
		this.kapiNo = kapiNo;
	}
	@Override
	public String toString() {
		return "OgretimGorevlisi [kapiNo=" + kapiNo + "]";
	}
	public String getKapiNo() {
		return kapiNo;
	}
	public void setKapiNo(String kapiNo) {
		this.kapiNo = kapiNo;
	}
	private String kapiNo;
	
	public void senatoToplantısı() {
		
		System.out.println("Toplantı Yapıldı");
		
	}
	public void sinavYap() {
		System.out.println("Sınav Yapıldı.");
	}
	
}
