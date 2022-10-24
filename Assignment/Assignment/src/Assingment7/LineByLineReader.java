package Assingment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLineReader{
	
	public String read(String path,int row) throws FileNotFoundException {
		String str = null;
		Scanner s = new Scanner(new File(path));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		s.close();
		for (int i = row-1; i <= row-1; i++) {
			str = list.get(i);
		}
		return str;
		
	}
}
