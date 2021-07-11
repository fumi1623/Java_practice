
public class Brave {
	
	private String name;
	private int hp;
	
	public Brave(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void showStatus() {
		System.out.println("[" + this.name + " HP=" + this.hp + "]");
	}
	
	void increaseHp(int hp) {
		this.hp += hp;
	}
	
//	void setHp(int hp) {
//		if (hp < 0) {
//			throw new IllegalArgumentException
//				("HP値にふの値を設定する処理が発生しました。");
//		}
//		this.hp = hp;
//	}
}
