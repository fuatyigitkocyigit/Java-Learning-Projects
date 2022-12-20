import java.util.Scanner;
import java.util.ArrayList;
public class InventoryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		ArrayList<Product> Products = new ArrayList<Product>();
		ArrayList<Grocery> Grocerys = new ArrayList<Grocery>();
		
		int ProductCount=1;
		while(true) {
			Boolean breakWhile = false;
			String input = keyboard.next();//Command
			switch(input) {
			case "np": {
				String input1 = keyboard.next();//Name
				String input2 = keyboard.next();//Type
				int input3 = keyboard.nextInt();//Cost
				Product ProductM = new Product(ProductCount, input3, input1, input2);
				ProductCount++;
				Products.add(ProductM);
				System.out.println("Created "+ ProductM.toString());
				break;
				
			}
			case "lp": {
				Product ProductM;
				for (int i=0; i < Products.size(); i++) {
					ProductM = Products.get(i);
					System.out.println(ProductM.toString());
				}
				break;
				
			}
			case "ns": {
				int input1 = keyboard.nextInt();//ProductNo
				int input2 = keyboard.nextInt();//Amount
				int input3 = keyboard.nextInt();//Price
				Grocery GroceryM = new Grocery(Products.get(input1-1), input3, input2);
				Grocerys.add(GroceryM);
				System.out.println("Now selling "+ GroceryM.toString());
				break;
				
			}
			case "ls": {
				Grocery GroceryM;
				for (int i=0; i < Grocerys.size(); i++) {
					GroceryM = Grocerys.get(i);
					System.out.println(GroceryM.toString());
				}
				break;
				
			}
			
			case "sp": {
				int input1 = keyboard.nextInt();//ProdutNo
				int input2 = keyboard.nextInt();//Amount
				int input3 = keyboard.nextInt();//Price
				boolean okey = false;
				Grocery GroceryM = null;
				for(int i=0; i<Grocerys.size(); i++) {
					GroceryM = Grocerys.get(i);
					if(input1 == GroceryM.getProduct().getProductNo() && input3 == GroceryM.getStockPrice()) {
						if(GroceryM.getStockAmount() < input2) {
							System.out.println("There are not enough products. Amount of the product in the stock: " +GroceryM.getStockAmount());
							okey = true;
							break;
						}
						else {
							GroceryM.setStockAmount(GroceryM.getStockAmount() - input2);
							System.out.println("Remaining Stock = " +GroceryM.toString());
							okey = true;
							break;
						}
					}
					else 
						continue;
				}
				for(int i=0; i<Grocerys.size(); i++) {
					GroceryM = Grocerys.get(i);
					if(input3 != GroceryM.getStockPrice() && okey == false) {
						System.out.println("There is no such product selling at " +input3+ "$. Please try again with correct price");
						break;
					}
				}
				break;
				
			}
			
			case "q": {
				Grocery GroceryM;
				for (int i=0; i < Grocerys.size(); i++) {
					GroceryM = Grocerys.get(i);
					System.out.println(GroceryM.toString());
				}
				breakWhile = true;
				break;
			}
		}
			if(breakWhile == true)
				break;
			
		}
		
	}
}
