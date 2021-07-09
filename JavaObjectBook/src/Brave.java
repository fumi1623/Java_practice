
public class Brave {
	
	String name;
	int hp;
	int level;
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
		this.level = 1;
	}
//	オーバーロード（上書き）：nameが入ってきたらこっちが実行される
	Brave(String name) {
//		this.hp = 50;
//		this.level = 1;
		this();
		this.name = name;
	}
	
	Brave(String name, int hp) {
//		this.name = name;
//		this.level = 1;
		this(name);
		this.hp = hp;
	}
	
	Brave(String name, int hp, int level) {
//		this.name = name;
//		this.hp = hp;
		this(name, hp);
		this.level = level;
	}
}
