
public class World3 {
	public static void main(String[] args) {
		
//		Cleric gandalf = new Cleric();
//		gandalf.name = "ガンダルフ";
//		gandalf.hp = 30;
//		gandalf.mp = 10;
//		
//        gandalf.cureMySelf();
//        gandalf.cureMySelf();
//        gandalf.cureMySelf();
		
//		Cleric.maxHp = 50;
//		Cleric.maxMp = 20;
//		
//		Cleric gandalf = new Cleric("ガンダルフ");
//		Cleric salman = new Cleric("サルマン", 25, 15);
//		
//		System.out.println(gandalf.name + " : HP = " + gandalf.hp + "/" + 
//				Cleric.maxHp + "  MP = " + gandalf.mp + "/" + Cleric.maxMp);
//		System.out.println(salman.name + " : HP = " + salman.hp + "/" + 
//				Cleric.maxHp + "  MP = " + salman.mp + "/" + Cleric.maxMp);
		
        Cleric.setMaxHp(50);
        Cleric.setMaxMp(50);
        
        Cleric gandalf = new Cleric("ガンダルフ");
        
        gandalf.showStatus();
	}

}
