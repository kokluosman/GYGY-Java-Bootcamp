package Assignment5;

public class Memur extends Calisan{
	
	private String departman;
	private String mesai;
	
	public Memur(String ad, String soyad, String email, String departman, String mesai) {
		super(ad, soyad, email);
		this.departman = departman;
		this.mesai = mesai;
	}
	@Override
	public String toString() {
		return "Memur [departman=" + departman + ", mesai=" + mesai + "]";
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	public String getMesai() {
		return mesai;
	}
	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
	
	public void calis() {
		System.out.println("Mesai bitirldi.");
	}
}
