
public class Person {

	String firstName, lastName;
	Address address;
	String birthday;
	
	public Person (String firstNameA, String lastNameA, String streetA, String cityA, String postCodeA, String countryA, String birthdayA) {
		this.firstName = firstNameA;
		this.lastName = lastNameA;
		this.address = new Address(streetA, cityA, postCodeA, countryA);
		this.birthday = birthdayA;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [First Name= " + firstName + ", Last Name= " + lastName + ", Birthday= "+ birthday +", Address= " + address +"]";
	}
	
}
