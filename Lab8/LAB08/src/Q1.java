import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size = keyboard.nextInt();
		int array[] = new int[size];
		int reverse[] = new int[size];
		
		System.out.println("Enter the numbers:");
		for (int i = 0; i < size; i++) {

			array[i] = keyboard.nextInt();

		}
		
		int k = size/2;
		
		for (int i=0; i<size/2; i++) {
			
			reverse[i] = array[k-1];
			k--;
			
		}
		
		for (int i=size/2; i<size; i++) {
			
			reverse[i] = array[i];
			
		}
		
		System.out.print("Reverse of array:");
		for (int i = 0; i<size; i++)
			System.out.print(reverse[i]+" ");
		
	}

}
