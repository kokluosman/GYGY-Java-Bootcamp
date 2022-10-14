package Assignment5;

public class GuvenlikGorevlisi extends Memur{

	private String belge;
	
	public void nobet() {
		System.out.println("Nöbet tutuldu");
	}
	
	public GuvenlikGorevlisi(String ad, String soyad, String email, String departman, String mesai, String belge) {
		super(ad, soyad, email, departman, mesai);
		this.belge = belge;
	}

	@Override
	public String toString() {
		return "GuvenlikGorevlisi [belge=" + belge + "]";
	}

	public String getBelge() {
		return belge;
	}

	public void setBelge(String belge) {
		this.belge = belge;
	}
}
