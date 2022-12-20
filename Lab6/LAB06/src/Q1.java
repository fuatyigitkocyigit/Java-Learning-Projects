import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		String s2="";
		
		System.out.println("Please enter your sentence: ");
		String s = keyboard.nextLine();
		
		int x = s.length();
		
		while (x>0) {
			s2 = s2 + s.substring(x-1,x);
			x--;
		}
		
		if (s.equals(s2)) {
			System.out.println("This sentence is a palindrome!");
		}
		else {
			System.out.println("This sentence is not a palindrome!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
