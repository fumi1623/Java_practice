
public class Cleric {
	
	String name;
	int hp;
	int mp;
	int level;
	static int maxHp;
	static int maxMp;
	
	Cleric(String name) {
		this.name = name;
		this.hp = 30;
		this.mp = 10;
		this.level = 1;
	}
	
	Cleric(String name, int hp, int mp) {
		this(name);
		this.hp = hp;
		this.mp = mp;
	}
	Cleric(String name, int hp, int mp, int level) {
		this(name, hp, mp);
		this.level = level;
	}
	
	void cureMySelf() {
		
		if (this.mp >= 5) {
			this.mp -= 5;
			this.hp += 10;
			System.out.println("HP = " + this.hp);
		} else {
			System.out.println("MPが足りません");
		}
		
	}
}
