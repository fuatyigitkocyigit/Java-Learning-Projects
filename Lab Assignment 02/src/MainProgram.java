import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Person[] Personn = new Person[100];
		Bank[] Bankk = new Bank[100];
		BankAccount[] Bankacc = new BankAccount[100];
		int percount = 0;
		int bancount = 0;
		int baccount = 0;

		System.out.print("Enter a command: ");
		String input = keyboard.next();

		while (!input.equals("Q")) {
			switch (input) {

			case "createPerson": {
				String fn = keyboard.next();
				String ln = keyboard.next();
				String bd = keyboard.next();
				String st = keyboard.next();
				String ct = keyboard.next();
				String pc = keyboard.next();
				String cu = keyboard.next();
				Personn[percount] = new Person(fn, ln, st, ct, pc, cu, bd);
				System.out.println(Personn[percount].toString());
				percount++;
				break;
			}

			case "createBank": {
				String bn = keyboard.next();
				String st = keyboard.next();
				String ct = keyboard.next();
				String pc = keyboard.next();
				String cu = keyboard.next();
				Bankk[bancount] = new Bank(bn, st, ct, pc, cu);
				System.out.println(Bankk[bancount].toString());
				bancount++;
				break;
			}

			case "createBankAccount": {
				int pi = keyboard.nextInt();
				int bi = keyboard.nextInt();
				double ba = keyboard.nextDouble();
				int an = keyboard.nextInt();
				Bankacc[baccount] = new BankAccount(Bankk[bi], Personn[pi], ba, an);
				System.out.println(Bankacc[baccount].toString());
				baccount++;
				break;
			}

			case "withdraw": {
				int an = keyboard.nextInt();
				double ao = keyboard.nextDouble();
				for (int i = 0; i < baccount; i++) {
					if (Bankacc[i].getAccountNumber() == an) {
						if (Bankacc[i].withdraw(ao) == -1) {
							System.out.println("Cannot withdraw a bigger amount than balance.");
							break;
						} else {
							System.out.println(Bankacc[i].toString());
							break;
						}
					} else
						continue;
				}
				break;

			}

			case "deposit": {
				int an = keyboard.nextInt();
				double ao = keyboard.nextDouble();
				for (int i = 0; i < baccount; i++) {
					if (Bankacc[i].getAccountNumber() == an) {
						Bankacc[i].deposit(ao);
						System.out.println(Bankacc[i].toString());
						break;
					} else
						continue;
				}
				break;

			}

			case "getAccountNumbers": {
				int in = keyboard.nextInt();
				for (int i = 0; i < percount; i++) {
					if ((Bankacc[i].getBank().getBankName()).equals(Bankk[in].getBankName())) {
						System.out.println("Account number: " + Bankacc[i].getAccountNumber());
						System.out.println((Bankacc[i].getOwner()).toString());
					} else
						continue;
				}
				break;
			}
			}
			System.out.print("Enter a command: ");
			input = keyboard.next();

		}

	}

}
