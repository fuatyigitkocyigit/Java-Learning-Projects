
public class Product {
	int productNo;
	String name;
	String type;
	int cost;
	
	public Product(int productNoM, int costM, String nameM, String typeM) {
		this.productNo = productNoM;
		this.cost = costM;
		this.name = nameM;
		this.type = typeM;
		
	}
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {	
		return "Product #" +productNo+ ": " +name+ " (" +type+ ") " +cost+ "$";
	}
	
}
