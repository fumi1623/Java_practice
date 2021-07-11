
public class Slime {

	private String name;
	private int hp;
	
	public Slime() {
		this.name = "名前はまだ無い";
		this.hp = 10;
	}
	
	public Slime(String name) {
		this();
		this.name = name;
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
	
	public void attack(Brave enemy) {
		enemy.setHp(enemy.getHp() - 2);
		System.out.println(this.name + "は" + enemy.getName() + "を攻撃した。");
		enemy.showStatus();
		if (enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "が死んだ！ ¥nGAME OVER");
		}
		
	}
	
	public void showStatus() {
		System.out.println("[" + this.name + " HP=" + this.hp + "]");
	}
}
