
public class Witch extends Character {
	
	public Witch(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack(Slime enemy) {
		enemy.setHp(enemy.getHp() - 2);
		System.out.println(this.getName() + "は" + 
				enemy.getName() + "を攻撃してダメージ2与えた。");
		enemy.showStatus();
	}
	
	void throwFireBall(Slime enemy) {
		enemy.setHp(enemy.getHp() - 10);
		System.out.println(this.getName() + "は" + 
				enemy.getName() + "を攻撃してダメージ10与えた。");
		enemy.showStatus();
	}
}
