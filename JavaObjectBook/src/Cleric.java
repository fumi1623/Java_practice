
public class Cleric {
	
	private String name;
	private int hp;
	private int mp;
	private int level;
	private static int maxHp;
	private static int maxMp;
	
	public Cleric(String name) {
		this.name = name;
		this.hp = 30;
		this.mp = 10;
		this.level = 1;
	}
	
	public Cleric(String name, int hp, int mp) {
		this(name);
		this.hp = hp;
		this.mp = mp;
	}
	
	public Cleric(String name, int hp, int mp, int level) {
		this(name, hp, mp);
		this.level = level;
	}
	
	public void cureMySelf() {
		if (this.mp >= 5) {
			this.mp -= 5;
			this.hp += 10;
			System.out.println("HP = " + this.hp);
		} else {
			System.out.println("MPが足りません");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new IllegalArgumentException
				("名前は2文字以上を指定してください。");
		}
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			throw new IllegalArgumentException
				("HP値は0以上を指定してください。");
		} else if (hp > Cleric.maxHp) {
			throw new IllegalArgumentException
			("HP値は最大HP以下を指定してください。");
		}
		this.hp = hp;
	}
	
    public int getMp() {
        return this.mp;
    }
    
    public void setMp(int mp) {
    	if (mp < 0) {
            throw new IllegalArgumentException
            ("MP値は0以上を指定してください。");
    	} else if (mp > Cleric.maxMp) {
            throw new IllegalArgumentException
            ("MP値は最大MP以下を指定してください。");
    	}
    	this.mp = mp;
    }
    
    public int getLevel() {
    	return this.level;
    }
    
    public void setLevel(int level) {
    	if (level < 1) {
    		throw new IllegalArgumentException
            ("レベルは1以上を指定してください。");
    	}
    	this.level = level;
    }
    
    public static int getMaxHp() {
    	return Cleric.maxHp;
    }
    
    public static void setMaxHp(int maxHp) {
    	if (maxHp < 0) {
            throw new IllegalArgumentException
            ("最大HP値は0以上を指定してください。");
    	}
    	Cleric.maxHp = maxHp;
    }
    
    public static int getMaxMp() {
    	return Cleric.maxMp;
    }
    
    public static void setMaxMp(int maxMp) {
    	if (maxMp < 0) {
            throw new IllegalArgumentException
            ("最大MP値は0以上を指定してください。");
    	}
    	Cleric.maxMp = maxMp;
    }
    
    public void showStatus() {
        System.out.println("[" + this.name + "：Lv=" + this.level +
            " HP=" + this.hp + "/" + Cleric.maxHp + " MP=" + this.mp +
            "/" + Cleric.maxMp + "]");
    }
	
}
