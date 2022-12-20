
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1,account2;
		
		account1 = new Account(0.03);
		account2 = new Account(0.04);
		
		account1.setaccountID(12345);
		account1.setcustomerName("Deniz");
		account1.setbalance(3000);
		account1.setvalidationYear(2023);
		account1.setstatus("Personal");
		
		account1.printAccount();
		account1.calculateInterest(2);
		
		///
		
		account2.readInformation();
		account2.printAccount();
		account2.calculateInterest(1);
		account2.areAccountsEqual(account1);
		
	}

}
