
public class World2 {
	public static void main(String[] args) {
		Brave alba = new Brave();
		alba.hp = 50;
		Brave joseph = alba;
		joseph.hp = 40;
		System.out.println("アルバ¥HP=" + alba.hp);
		System.out.println("ジョセフ¥HP=" + joseph.hp);
	}
}
