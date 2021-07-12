
public class World {

	public static void main(String[] args) {
		WitchFighter madoka = new WitchFighter("まどか", 30);
		Slime slimeA = new Slime("スライムA");
		
//		madoka.attack(slimeA);
//		madoka.throwFireBall(slimeA);
//		madoka.fireBreak(slimeA);
		
		Witch w = madoka;
		w.attack(slimeA);
		w.throwFireBall(slimeA);
//		w.fireBreak(slimeA);  エラー
	}
}
