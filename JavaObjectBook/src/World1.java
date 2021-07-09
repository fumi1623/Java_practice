
public class World1 {
	public static void main(String[] args) {
		Brave alba = new Brave();
		alba.hp = 50;
		Brave joseph = new Brave();
		joseph.hp = 50;
		alba.hp = 40;
		System.out.println("アルバ¥HP=" + alba.hp);
		System.out.println("ジョセフ¥HP=" + joseph.hp);
	}
}
