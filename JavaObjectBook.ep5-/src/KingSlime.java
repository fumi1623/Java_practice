
public class KingSlime extends Slime {
	
	private static int basePower = 10;
	
	public KingSlime(String name) {
		super(name);
	}
	
//	private String name;
//	private int hp;
//	
//	public KingSlime() {
//		this.name = "名前はまだない";
//		this.hp = 15;
//	}
//	
//	public KingSlime(String name) {
//		this();
//		this.name = name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getHp() {
//		return this.hp;
//	}
//	
//	public void setHp(int hp) {
//		if (hp < 0) {
//			this.hp = 0;
//		} else {
//			this.hp = hp;
//		}
//	}
//	
	@Override
	public void attack(Brave enemy) {
//		enemy.setHp(enemy.getHp() - 4);
////		System.out.println(this.name + "は" + enemy.getName() + "を攻撃した。");
////		enemy.showStatus();
//		if (enemy.getHp() <= 0) {
//			System.out.println(enemy.getName() + "が死んだ！ ¥nGAME OVER");
//		} else {
//			System.out.println(this.getName() + "は" + enemy.getName() + "を攻撃した。");
//			enemy.showStatus();
//		}
		super.attack(enemy);
		super.attack(enemy);
	}
	
	public void overlie(Brave enemy) {
		int ratio = new java.util.Random().nextInt(3) + 1;
		enemy.setHp(enemy.getHp() - KingSlime.basePower * ratio);
//		System.out.println(this.name + "は" + enemy.getName() + "にのしかかった。");
		System.out.println(this.getName() + "は" + enemy.getName() + "にのしかかった。");
		enemy.showStatus();
		if (enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "が死んだ！ ¥nGAME OVER");
		}
	}
	
//	public void showStatus() {
//		System.out.println("[" + this.name + " HP=" + this.hp + "]");
//	}
}
