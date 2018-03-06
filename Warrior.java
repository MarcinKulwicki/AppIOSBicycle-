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
		if (super.lvl == 4 || super.hp == 6 || super.hp == 8) {
			super.hp += 1;
			super.maxHp += 1;
		}
		//Sila ataku
		if (super.lvl == 8) {
			super.hitPower += 1;
		}
	}

	@Override
	public String toString() {
		return "Warrior: "+ this.name + "  ||  " + (int)super.hp + " HP LVL: " + (int)super.lvl + " EXP: " + (int)super.exp +" ATT: "
				+ (int)super.hitPower;
	}
}
