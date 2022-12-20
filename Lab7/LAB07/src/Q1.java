import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a 7 digit number: ");
		int x = keyboard.nextInt();
		int x1 = x;
		
		System.out.print("Reverse of "+x+" is ");
		for (int i = 7; i>0; i--) {
			int w=1;
			while (w>0) {
				int a = x1%10;
				x1 = x1/10;
				System.out.print(a);
				
				w--;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
