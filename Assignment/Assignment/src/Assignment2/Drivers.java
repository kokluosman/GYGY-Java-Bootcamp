package Assignment2;

public class Drivers {

	public static void main(String[] args) {
		String data = "aaaafggg assssvv t@";
		zip(data);
	}

	static void zip(String dizi) {
		int count = 1;
		
		for (int i = 0; i < dizi.length()-1; i++) {
			if (dizi.charAt(i) == dizi.charAt(i+1)) {
				count++;
			}else if(dizi.charAt(i) =='@') {
				break;
			}else if(dizi.charAt(i) ==' ') {
				System.out.print(" ");
			}
			else {
				System.out.print(dizi.charAt(i)+Integer.toString(count));
				count =1;
			}
		}
	}
}
