
public class Address {
	
	String street, city, postCode, country;
	
	public Address (String streetA, String cityA, String postCodeA, String countryA){
		this.street = streetA;
		this.city = cityA;
		this.postCode = postCodeA;
		this.country = countryA;
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return street + ", " + city + ", " + country +", ("+postCode+")";
	}
	
}
