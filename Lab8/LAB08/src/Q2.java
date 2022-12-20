import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter:");
		int size = keyboard.nextInt();
		
		System.out.println("Enter the numbers");
		
		int array [] = new int [size+1];
		int three [] = new int [size+1];
		int seven [] = new int [size+1];
		int not [] = new int [size+1];
	
		for (int i=0; i<size; i++) {
			
			array[i] = keyboard.nextInt();
			
		}
		
		int ьз=0,yedi=0,nott=0;
		
		for (int i=0; i<size; i++) {
		
		if (array[i]%3 == 0) {
			three[ьз] = array[i];
			ьз++;
			
		}
		
		else if (array[i]%7 == 0) {
			seven[yedi] = array[i];
			yedi++;
			
		}
		
		else {
			not[nott] = array[i];
			nott++;
			
		}
		
	}
		
		System.out.print("Numbers divided by three: ");
		for (int i=0; i<ьз; i++)
			System.out.print(three[i]+" ");
		
		System.out.println("");
		
		System.out.print("Numbers divided by seven: ");
		for (int i=0; i<yedi; i++)
			System.out.print(seven[i]+" ");
		
		System.out.println("");
		
		System.out.print("Numbers not divided by three or seven: ");
		for (int i=0; i<nott; i++)
			System.out.print(not[i]+" ");
		
		
	}

}
