package Assignment1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		data =data.replace('A', '1');
		data =data.replace('a', '1');
		data =data.replace('E', '2');
		data =data.replace('e', '2');
		data =data.replace('I', '3');
		data =data.replace('ı', '3');
		data =data.replace('İ', '4');
		data =data.replace('i', '4');
		data =data.replace('O', '5');
		data =data.replace('o', '5');
		data =data.replace('Ö', '6');
		data =data.replace('ö', '6');
		data =data.replace('U', '7');
		data =data.replace('u', '7');
		data =data.replace('Ü', '8');
		data =data.replace('ü', '8');
		System.out.println(data);
	}
	
}
