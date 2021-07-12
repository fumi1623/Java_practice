
public abstract class Character {
	
	private String name;
	private int hp;

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() { return this.name; }
	
	public int getHp() { return this.hp; }
	
	public abstract void attack(Slime enemy);
}
