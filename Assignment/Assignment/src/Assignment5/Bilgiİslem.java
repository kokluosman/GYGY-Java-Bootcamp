package Assignment5;

public class Bilgiİslem extends Memur{

	private String gorev;
	
	
	
	public Bilgiİslem(String ad, String soyad, String email, String departman, String mesai, String gorev) {
		super(ad, soyad, email, departman, mesai);
		this.gorev = gorev;
	}

	@Override
	public String toString() {
		return "Bilgiİslem [gorev=" + gorev + "]";
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	
	public void networkKurulum() {
		System.out.println("Network kuruldu");
	}
}
