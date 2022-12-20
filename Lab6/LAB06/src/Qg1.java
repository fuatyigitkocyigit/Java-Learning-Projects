import java.util.Scanner;

public class Qg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your number: ");
		int x = keyboard.nextInt();
		int a = 0;
		System.out.print("Reverse of number is ");
		
		while (x>0) {
			a = x - (x/10)*10;
			
			System.out.print(a);
			
			x = x/10;
			
		}
		
	}

}
