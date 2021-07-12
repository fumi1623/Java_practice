
public class World {
	
	public static void main(String[] args) {
		
		Brave alba = new Brave("アルバ");
//		Slime slimeA = new Slime("スライムA");
		KingSlime kingSlimeA = new KingSlime("キングスライムA");
		
//		while (true) {
//			alba.attack(slimeA);
//			if (slimeA.getHp() == 0) break;
//			
//			slimeA.attack(alba);
//			if (alba.getHp() == 0) break;
//		}
		
//		while (true) {
//			alba.attack(kingSlimeA);
//			if (kingSlimeA.getHp() == 0) break;
//			
//			kingSlimeA.overlie(alba);
//			if (alba.getHp() == 0) break;
//		}
		
//		kingSlimeA.showStatus();
//		kingSlimeA.attack(alba);
//		
//		kingSlimeA.overlie(alba);
		
//		slimeA.attack(alba);
		kingSlimeA.attack(alba);
	}
}
