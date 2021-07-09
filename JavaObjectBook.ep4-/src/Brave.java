
public class Brave {
	
	String name;
	private int hp;
	
	Brave(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	void increaseHp(int hp) {
		this.hp += hp;
	}
	
	int getHp() {
		return this.hp;
	}
}
