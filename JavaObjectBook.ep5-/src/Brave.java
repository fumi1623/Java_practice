
public class Brave {
	
	private String name;
	private int hp;
	
	public Brave(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
	
	public void attack(KingSlime enemy) {
		int power = new java.util.Random().nextInt(10) + 1;
		enemy.setHp(enemy.getHp() - power);
		System.out.println(this.name + "は" + enemy.getName() + "を攻撃した。");
		enemy.showStatus();
		if (enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "を倒した。");
		}
	}
	
	public void showStatus() {
		System.out.println("[" + this.name + " HP=" + this.hp + "]");
	}
}
