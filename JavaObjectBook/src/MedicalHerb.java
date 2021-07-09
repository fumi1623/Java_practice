
public class MedicalHerb {
	String name;
	
	void use(Brave brave) {
		brave.hp += 10;
		System.out.println(brave.name + "は「" + this.name + "」を使った。");
		System.out.println(brave.name + "はHPが10回復して" + brave.hp + "になった。");
	}
}
