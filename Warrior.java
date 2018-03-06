package Rozgrywka;



class Warrior extends Postac {

		private String name;

	Warrior(String n) {
		this.name = n;
		super.hp = 120;
		super.maxHp = 120;
		super.lvl = 0;
		super.exp = 0;
		super.hitPower = 5;
		
	}
	
	protected void lvlUp() {
		System.out.println("Warrior");
		super.maxHp += 20;
		super.hp = this.maxHp;
		super.hitPower += 8;
	}


	protected void getInfo() {
		System.out.println("Warrior: "+ this.name + "  ||  " + (int)super.hp + " HP LVL: " + (int)super.lvl + " EXP: " + (int)super.exp +" ATT: "
				+ (int)super.hitPower);
	}
}
