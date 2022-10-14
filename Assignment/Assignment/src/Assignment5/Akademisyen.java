package Assignment5;

public class Akademisyen extends Calisan{
	
	private String bolum;
	private String unvan;

	public Akademisyen(String ad, String soyad, String email, String bolum, String unvan) {
		super(ad, soyad, email);
		this.bolum = bolum;
		this.unvan = unvan;
	}
	
	public void derseGir() {
		System.out.println("Derse Girildi");
	}

	@Override
	public String toString() {
		return "Akademisyen [bolum=" + bolum + ", unvan=" + unvan + "]";
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

}
