
public class Slime {

	private String name;
	private int hp;
	
	public Slime() {
		this.name = "名前はまだ無い";
		this.hp = 20;
	}
	
	public Slime(String name) {
		this();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
	
	public void showStatus() {
		System.out.println("[" + this.name + " HP=" + this.hp + "]");
	}
}
