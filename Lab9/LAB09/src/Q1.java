import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the required size of ball-array");
		int size = keyboard.nextInt();
		
		int array [] = new int [size];
		
		System.out.println("Enter "+size+" numbers, randomly. Write even or odd numbers.");
		
		for (int i=0; i<size; i++) {
			
			array[i] = keyboard.nextInt();
			
		}
		
		System.out.print("Original Array: ");
		for (int i=0; i<size; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		System.out.println("");
		
		
		for(int i=1; i<size-1; i++) {
			
			int left = array[i-1];
			int right = array[i+1];
			
			if(left%2 == 0 && right%2 == 0 && array[i]%2 != 0)
				array[i]=array[i]+10;
			
		}
		
		System.out.print("Updated Array: ");
		for (int i=0; i<size; i++) {
			
			System.out.print(array[i]+" ");
		
		}
		
	}

}
