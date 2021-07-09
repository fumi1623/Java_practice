
public class Slime {
	String name;
	int hp;
	static int price;
	
	Slime(String name) {
		this.hp = 10;
		this.name = name;
	}
	
	static int getPrize() {
		int ratio = new java.util.Random().nextInt(5) + 1;
		return Slime.price * ratio;
	}
}
