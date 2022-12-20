
public class Bank {

	String bankName;
	Address bankAddress;
	
	public Bank (String bankNameA, String streetA, String cityA, String postCodeA, String countryA) {
		
		this.bankName = bankNameA;
		this.bankAddress = new Address(streetA, cityA, postCodeA, countryA);
		
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(Address bankAddress) {
		this.bankAddress = bankAddress;
	}

	@Override
	public String toString() {
		return "Bank [Bank Name= " + bankName + ", Bank Address= " + bankAddress + "]";
	}
	
}
