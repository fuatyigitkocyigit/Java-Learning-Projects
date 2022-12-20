import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the words for 7 days:");
		
		String array [] = new String [7];
		int alength [] = new int [7];
		
		for (int i=0; i<7; i++) {
			
			array[i] = keyboard.next();
			
		}
		
		for (int i=0; i<7; i++) {
			
			alength[i] = array[i].length();
			
		}
		
		int max=0, count=0;
		
		for (int i=0; i<7; i++) {
			
			String first = array[i].substring(0,1);
			
			if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
				if (alength[i]>max) {
					max = alength[i];
					count = i;
					}
				}
			
		}
		
		String day ="";
		
		switch (count) {
		
		case 0:
			day = "Monday";
			break;
		case 1:
			day = "Tuesday";
			break;
		case 2:
			day = "Wednesday";
			break;
		case 3:
			day = "Thursday";
			break;
		case 4:
			day = "Friday";
			break;
		case 5:
			day = "Saturday";
			break;
		case 6:
			day = "Sunday";
			break;
			
		}
		
		System.out.println("Day with longest word: "+day);
		
	}

}
