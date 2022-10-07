package Assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.management.StringValueExp;

public class Driver {

	public static void main(String[] args) {
		//zip();
		flip();
		}
	
	static void flip() {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		List<Character> list = new ArrayList<>();
		System.out.println("String ifadeyi giriniz.");
		Scanner in = new Scanner(System.in);
		String l1 = in.nextLine(); 
		for (int i = 0; i < l1.length(); i++) {
			list.add(l1.charAt(i));
		}
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (Character x : list) {
				if(list.get(i)==x) {
					count++;
				}
			}
			//System.out.print(list.get(i) + String.valueOf(count));
			
			hashSet.add(list.get(i)+String.valueOf(count));
			
		}
		String result = String.join("", hashSet);
		System.out.println(result);

	}
	static void zip() {
		System.out.println("String ifadeyi giriniz.");
		Scanner in = new Scanner(System.in);
		LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
		String l1 = in.nextLine(); 
		for (int i = 0; i < l1.length(); i++) {
			hashSet.add(l1.charAt(i));
		}
		System.out.println(hashSet.toString().replaceAll("\\,|\\[|\\]|\\s", ""));
	}
}
