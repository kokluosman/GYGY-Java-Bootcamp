package Assignment2;

import java.util.Arrays;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		
		Integer[][] myArray = {{1,2,3},{4,5,6},{7,8,9}}; 
        System.out.println("Original Array:" + Arrays.deepToString(myArray));
        arrayFlip1(myArray); 
        arrayFlip2(myArray);
		
	}
		
	static void arrayFlip1(Integer myArray[][]) {
		Collections.reverse(Arrays.asList(myArray)); 
		for (int i = 0; i < myArray.length; i++) {
			Collections.reverse(Arrays.asList(myArray[i]));
		}
        System.out.println("arrayFlip1:" + Arrays.deepToString(myArray));
	}
	
	static void arrayFlip2(Integer myArray[][]) {
		int transpose[][] = new int[3][3];
		 for(int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                transpose[j][i] = myArray[i][j];
	            }
	        }
		 System.err.println(Arrays.deepToString(transpose));
		 Collections.reverse(Arrays.asList(transpose));
		 System.out.println("arrayFlip2" + Arrays.deepToString(transpose));
	}
}
