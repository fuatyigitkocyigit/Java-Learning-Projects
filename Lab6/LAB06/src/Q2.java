import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int x = 1;
		int t = 1;
		
		while (x>0) {
		
		System.out.println("Please enter the lower bound: ");
		int low = keyboard.nextInt();
		
		System.out.println("Please enter the upper bound: ");
		int up = keyboard.nextInt();
	
			if(up<low) {
				System.out.println("Lower bound must be........");
			}
				
			else{
				while (up>=low) {
				
						t=t*up;
						up--;
					
					}
				break;
				}
				
			}
		
		System.out.println("The sum of the cubes is: "+t);
		
	}

}
