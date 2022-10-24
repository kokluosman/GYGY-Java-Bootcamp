package Assingment7;

import java.io.FileNotFoundException;

public class Driver {

public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	String path = "C:\\\\Users\\\\koklu\\\\Desktop\\\\java\\\\GelecegiYazanlarTurkcell\\\\Assignment\\\\Assignment\\\\src\\\\Assingment7\\\\file.txt";
		
	LineByLineReader lineReader = new LineByLineReader();
	System.out.println(lineReader.read(path, 3));
	
	
//	WordByWordReader reader = new WordByWordReader();
//	try {
//		reader.read(path);
//	} catch (FileNotFoundException e) {
//		e.getMessage();
//	}
//		 
//	}
	}
}
