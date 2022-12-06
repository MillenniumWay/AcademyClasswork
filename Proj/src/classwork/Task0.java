package classwork;
import java.util.Arrays;
import java.util.Scanner;


public class Task0 {
	
//	0. Создать массив типа String с размером 7. 
//	Записать в него значения дней недели. 
//	Вывести на консоль значение последнего элемента.
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String[] arraySource = new String[7];
		
			arraySource[0] = "Понедельник";
			arraySource[1] = "Вторник";
			arraySource[2] = "Среда";
			arraySource[3] = "Четверг";
			arraySource[4] = "Пятница";
			arraySource[5] = "Суббота";
			arraySource[6] = "Воскресенье";
			
			
			System.out.println("Введите индекс массива от 1о до 7о");
			int k = scan.nextInt();
			System.out.println(arraySource[k]);

}
}
