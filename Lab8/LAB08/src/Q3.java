import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many numbers will you enter:");
		int size = keyboard.nextInt();
		
		System.out.println("Enter the numbers");
		
		int array [] = new int [size+1];
		int prime [] = new int [size+1];
		int nonprime [] = new int [size+1];
	
		for (int i=0; i<size; i++) {
			
			array[i] = keyboard.nextInt();
			
		}

		int cprime=0, cnonprime=0;
		
		for (int i=0; i<size; i++) {
			
			for (int k=2; k<array[i]; k++) {
				
				if(array[i]%k == 0) {
					nonprime[cnonprime]=array[i];
					cnonprime++;
					break;
				}
			}
		
			if (array[i]<=1) {
				nonprime[cnonprime]=array[i];
				cnonprime++;
				break;
			}
			
			else {	
				prime[cprime] = array[i];
				cprime++;
				break;
			}
			
		}
		
		System.out.print("Prime numbers: ");
		for (int i=0; i<cprime; i++)
			System.out.print(prime[i]+" ");
		
		System.out.println("");
		
		System.out.print("Nonprime numbers: ");
		for (int i=0; i<cnonprime; i++)
			System.out.print(nonprime[i]+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
