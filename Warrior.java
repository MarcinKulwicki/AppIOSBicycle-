package Rozgrywka;



class Warrior extends Postac {

		private String name;

	Warrior(String n) {
		
		this.name = n;
		super.hp = 5;
		super.maxHp = 5;
		super.hitPower = 4;
		
	}
	@Override
	protected void lvlUp() {
		System.out.println("Warrior");
		super.maxHp += 1;
		super.hp = this.maxHp;
		super.hitPower += 1;
		
		//HP
		if (super.hp == 8 && super.hp == 10 && super.hp == 12) {
			super.hp += 1;
		}
		//Sila ataku
		if (super.hitPower == 12) {
			super.hitPower += 1;
		}
	}

	@Override
	protected void getInfo() {
		System.out.println("Warrior: "+ this.name + "  ||  " + (int)super.hp + " HP LVL: " + (int)super.lvl + " EXP: " + (int)super.exp +" ATT: "
				+ (int)super.hitPower);
	}
}
