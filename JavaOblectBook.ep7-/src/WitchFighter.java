
public class WitchFighter extends Witch {
	public WitchFighter(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack(Slime enemy) {
		enemy.setHp(enemy.getHp() - 4);
		System.out.println(this.getName() + "は" + 
				enemy.getName() + "を攻撃してダメージ4与えた。");
		enemy.showStatus();
	}
	
	public void fireBreak(Slime enemy) {
		enemy.setHp(enemy.getHp() - 20);
		System.out.println(this.getName() + "は" + 
				enemy.getName() + "に火炎斬りを放ってダメージ20与えた。");
		enemy.showStatus();
	}
}
