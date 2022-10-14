package Assignment5;

import java.time.LocalDate;

public abstract class Calisan {
	private String ad;
	private String soyad;
	private String email;
	
	public Calisan(String ad, String soyad, String email) {
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public void anaGiris() {
		System.out.println("Ana girişten Girildi " + LocalDate.now());
	}
	
	public void cikis() {
		System.out.println("Ana girişten Çıkıldı "+LocalDate.now());
	}
	
	public void yemekhane() {
		System.out.println("Yemek yendi" + LocalDate.now());
	}	

	@Override
	public String toString() {
		return "Calisan [ad=" + this.ad + ", soyad=" + this.soyad + ", email=" + this.email + "]";
	}
}
