import java.util.Scanner;
public class BigNumberCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter a command: ");
		String input = keyboard.next();
		
		while(!input.equals("Q")) {
			
			String input1 = keyboard.next();//first number
			BigNumber thiss = new BigNumber(input1);
			////
			String input2 = keyboard.next();//second number
			BigNumber second = new BigNumber(input2);
			////
			
			switch(input) {
			case "max": {
				System.out.println(thiss.Maximum(second).toString());
				break;
			}
			case "min": {
				System.out.println(thiss.Minimum(second).toString());
				break;
			}
			case "add": {
				System.out.println(thiss.Add(second).toString());
				break;
			}
			case "sub": {
				System.out.println(thiss.Substarct(second).toString());
				break;
			}
			case "max3":{
				String input3 = keyboard.next();//second number
				BigNumber third = new BigNumber(input3);
				System.out.println(thiss.max3(second, third).toString());
				break;
			}
			default: {
				System.out.println("Unknown command, please enter a correct command");
				break;
			}
			}
			System.out.print("Enter a command: ");
			input = keyboard.next();
			
		}	
	}
}
