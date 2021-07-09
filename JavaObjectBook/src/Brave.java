
public class Brave {
	
	String name;
	int hp;
	
	void haveABreak() {
		this.hp += 10;
		System.out.println(this.name + "は休憩した。[HP=" + this.hp + "]");
	}
}
