
public class Movie extends Product {
	
//	private String title;
//	private int price;
	private char regionCode;
	
	public Movie(String title, int price, char regionCode) {
//		this.title = title;
//		this.price = price;
		super(title, price);
		this.regionCode = regionCode;
	}

//	public String getTitle() { return this.title; }
//	
//	public int getPrice() { return this.price; }
	
	public char getRegionCode() { return this.regionCode; }
}
