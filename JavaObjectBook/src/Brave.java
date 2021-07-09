
public class Brave {
	
	String name;
	int hp;
//	MedicalHerb herb;
//	
//	void haveABreak() {
//		this.hp += 10;
//		System.out.println(this.name + "は休憩した。[HP=" + this.hp + "]");
//	}
//	コンストラクタ：newを使った時、自動で呼び出される
//	メソットとクラス名が一致＆戻り値無し(voidも無し)
	
	Brave() {
		this.name = "名前はまだ無い";
		this.hp = 50;
	}
	
	Brave(String name) {
		this.name = name;
		this.hp = 50;
	}
}
