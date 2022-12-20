
public class Grocery implements StockInterface{
	Product product;
	int price;
	int amount;
	
	public Grocery (Product productM, int priceM, int amountM) {
		this.product = productM;
		this.price = priceM;
		this.amount = amountM;
		if(product.getCost() > price)
			System.out.println("Warning, sale price is lower than product cost");
		
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getStockPrice() {
		return price;
	}

	public void setStockPrice(int price) {
		this.price = price;
	}

	public int getStockAmount() {
		return amount;
	}

	public void setStockAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return product.toString()+ ", selling at " +price+ "$ with " +amount+ " left";
	}

}
