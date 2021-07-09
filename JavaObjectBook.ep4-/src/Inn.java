
public class Inn {
	
//	void lodge(Brave brave) {
//		brave.hp -= 50;
//		System.out.println(brave.name + "のHPが" + brave.hp + "に回復した。");
//	}
	
	void lodge(Brave brave) {
		brave.increaseHp(50);
		System.out.println(brave.name + "のHPが" + brave.getHp() + "に回復した");
	}
}
