
public class Music extends Product {
	
//	private String title;
//	private int price;
	private String artist;
	
	public Music(String title, int price, String artist) {
//		this.title = title;
//		this.price = price;
		super(title, price);
		this.artist = artist;
	}
	
//	public String getTitle() { return this.title; }
//	
//	public int getPrice() { return this.price; }
	
	public String getArtist() { return this.artist; }
}
