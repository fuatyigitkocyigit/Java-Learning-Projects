import java.util.Scanner;

public class Account {

	Scanner keyboard = new Scanner(System.in);
	double interestRate;
	private double balance;
	private int accountID, validationYear;
	private String customerName;
	private boolean status;
	
	public Account(double input) {
		interestRate = input;
		
	}
	
    public double getbalance() {
        return balance;
  }

    public void setbalance(double value) {
        this.balance = value;
  }
	
    public int getaccountID() {
        return accountID;
  }

    public void setaccountID(int value) {
        this.accountID = value;
  }
    public int getvalidationYear() {
        return validationYear;
  }

    public void setvalidationYear(int value) {
        this.validationYear = value;
  }
    public String getcustomerName() {
        return customerName;
  }

    public void setcustomerName(String value) {
        this.customerName = value;
  }
    public boolean getstatus() {
        return status;
  }

    public void setstatus(String value) {
    	if (value.equals("Personal"))
			status = true;
    	
		else if (value.equals("Corporate"))
			status = false;
    	
  }
	
	public void readInformation() {
		
		System.out.println("Enter information of second account:");
		
		System.out.println("Account ID:");
		accountID = keyboard.nextInt();
		
		System.out.println("Customer Name:");
		customerName = keyboard.next();
		
		System.out.println("Balance:");
		balance = keyboard.nextDouble();
		
		System.out.println("Validation Year:");
		validationYear = keyboard.nextInt();
	
		System.out.println("Status (Personal/Corporate):");
		if (keyboard.next().equals("Personal"))
			status = true;
		else 
			status = false;
		
		System.out.println("");
	}
	
	
	public void calculateInterest(int value) {
		
		if(value==1) {
			
			double annual = balance*interestRate*12;
			
			annual = annual + accountID%100;
			
			System.out.println("Annual interest rate for this account is "+annual+" TL:");
			System.out.println("");
		}
		
		else {
			
			double monthly = balance*interestRate;
			
			if(status==false)
				monthly = monthly - monthly/10;
			
			System.out.println("Monthly interest rate for this account is "+monthly+" TL:");
			System.out.println("");
		}
	}
	
	
	public void printAccount() {
		
		if(status==true)
		System.out.println("Customer "+customerName+" has "+balance+" TL on the personal account with ID "+accountID+". The account is valid until "+validationYear+".") ;
		
		else
		System.out.println("Customer "+customerName+" has "+balance+" TL on the corporate account with ID "+accountID+". The account is valid until "+validationYear+".") ;
		
		System.out.println("");
	}
	
	public void areAccountsEqual(Account account2) {
		
		 if (this.accountID==account2.getaccountID() && this.customerName.equals(account2.getcustomerName()) && this.balance==account2.getbalance() && this.validationYear==account2.getvalidationYear()) 
             System.out.println("These accounts are same.");
		 else
			 System.out.println("These accounts are not same.");
		
		 System.out.println("");
	}
	
}
