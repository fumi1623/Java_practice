
public class World {
	
	public static void main(String[] args) {
		
		Brave alba = new Brave("アルバ");
		Slime slimeA = new Slime("スライムA");
		
		while (true) {
			alba.attack(slimeA);
			if (slimeA.getHp() == 0) break;
			
			slimeA.attack(alba);
			if (alba.getHp() == 0) break;
		}
	}
}
