package Assingment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WordByWordReader {

	
	public void read(String path) throws FileNotFoundException, InterruptedException{
		Scanner s = new Scanner(new File(path));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		for (String  x: list) {
			System.out.println(x);
			TimeUnit.SECONDS.sleep(1);
		}
	}
	
}
