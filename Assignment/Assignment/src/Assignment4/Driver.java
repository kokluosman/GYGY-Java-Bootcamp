package Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		System.err.println(flip("numan karaaslan"));
		
		
	}
	
	public static String flip(String s) {
		LinkedHashMap<Integer, Character> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			hashMap.put(i, s.charAt(i));
		}
		LinkedHashSet<String> strings = new LinkedHashSet<>();
		for (Integer i : hashMap.keySet()) {
			int counter = 0;
			for (Integer j : hashMap.keySet()) {
				if (hashMap.get(i) == hashMap.get(j)) {
					counter ++;
				}
			}
			strings.add(hashMap.get(i)+String.valueOf(counter));
		}
		String result = String.join("", strings);
		return result;
	}

}
