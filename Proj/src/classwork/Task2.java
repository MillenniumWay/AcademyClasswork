package classwork;

import java.util.Arrays;

public class Task2 {
//	2. Создать массив типа String размером 3х6. И записать в него значения:
//		a1  a2  a3  a4  a5  a6
//		b1  b2  b3  b4  b5  b6
//		c1  c2   c3  c4  c5  c6
	public static void main(String[] args) {
		String[][] array = new String[3][6];
		char c = 'a';
		for (int i = 0; i < array.length; i ++){
			for(int a = 0; a < array[i].length; a ++) {
				array[i][a] = String.valueOf(c + (a + 1));
				
			}
			c++;
			
		}
		System.out.println(Arrays.deepToString(array));
		
		
		
		
	}

}
