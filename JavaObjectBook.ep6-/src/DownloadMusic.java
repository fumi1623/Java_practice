
public class DownloadMusic extends Music implements Preview {
	
	private String format;
	
	public DownloadMusic(String title, int price, String artist, String format) {
		super(title, price, artist);
		this.format = format;
	}
	
	@Override
	public void play() {
		System.out.println("音楽を再生中");
	}
	
	@Override
	public void stop() {
		System.out.println("音楽を停止中");
	}
	
	public String getFormat() { return this.format; }
}
