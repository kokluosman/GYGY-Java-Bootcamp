package Assignment5;

import java.time.LocalDate;

public class Driver {

	public static void main(String[] args) {
			
		Akademisyen akademisyen = new Akademisyen("Osman", "kÖKLÜ", "asd@hotmail.com", "Elektrik Eletronik Mühendisliği", "Ar.Gör");
		Asistan asistan = new Asistan("Derya", "Deniz", "derya@hotmal.com", "Elektronik", "Ar.Gör", LocalDate.now());
		asistan.anaGiris();
		akademisyen.anaGiris();
	}
}
