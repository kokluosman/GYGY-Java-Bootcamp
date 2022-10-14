package Assignment5;

import java.time.LocalDate;

public class Asistan extends Akademisyen {

	private LocalDate ofisSaati;
	
	public void derseGir(){
		System.out.println("Derse Girildi");
	}
	
	public Asistan(String ad, String soyad, String email, String bolum, String unvan, LocalDate ofisSaati) {
		super(ad, soyad, email, bolum, unvan);
		this.ofisSaati = ofisSaati;
	}

	public LocalDate getOfisSaati() {
		return ofisSaati;
	}

	public void setOfisSaati(LocalDate ofisSaati) {
		this.ofisSaati = ofisSaati;
	}

	@Override
	public String toString() {
		return "Asistan [ofisSaati=" + ofisSaati + "]";
	}

	public void quizYap(){
		System.out.println("Quiz Yapıldı");
	}
	
	public void lablaraGir(){
		System.out.println("Laba Girildi");
	}
	
	
}
