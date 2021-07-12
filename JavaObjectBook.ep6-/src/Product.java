
public abstract class Product {

	private String title;
	private int price;
	
	public Product(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() { return this.title; }
	
	public int getPrice() { return this.price; }
}
