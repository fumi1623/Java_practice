
public class World {
	public static void main(String[] args) {
//		MedicalHerb herb = new MedicalHerb();
//		herb.name = "薬草";
//		Brave alba = new Brave();
//		alba.name = "アルバ";
//		alba.hp = 50;
//		alba.herb = herb;
//		alba.herb.use(alba);
		
		Brave noName = new Brave();
		Brave alba = new Brave("アルバ");
		System.out.println(noName.name);
		System.out.println(alba.name);
		
	}
}
