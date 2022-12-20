
public class BankAccount {
	
	Bank bank;
	Person owner;
	double balance;
	int accountNumber;
	
	public BankAccount (Bank bankA, Person ownerA, double balanceA, int accountNumberA) {
		
		this.bank = bankA;
		this.owner = ownerA;
		this.balance = balanceA;
		this.accountNumber = accountNumberA;
		
	}
	
	public double withdraw(double amount) {
		double balanceA = balance-amount;
		
		if(balanceA<0)
			return -1;
		else {
			balance = balance-amount;
			return balance;
		}
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
		
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Bank Account Information:\r\n"+ "Balance= "+this.balance+"\r\n"+ "Account Number= "+this.accountNumber+"\r\n"+this.bank.toString()+"\r\n"+this.owner.toString();
	}
	
}
