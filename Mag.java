package Rozgrywka;



class Mag extends Postac {
	
	private String name;
	
	Mag(String n) {
		super();
		this.name = n;
		super.hp = 4;
		super.maxHp = 4;
		super.hitPower = 4;
	}
	
	@Override
	protected void lvlUp() {
		super.maxHp += 1;
		super.hp = this.maxHp;
		super.hitPower += 1;
		
		//HP
		if (super.lvl == 6 || super.lvl == 8) {
			super.hp += 1;
			super.maxHp += 1;
		}
		//Sila ataku
		if (super.lvl == 6 || super.lvl == 8) {
			super.hitPower += 1;
		}
	}
	
	@Override
	public String toString() {
		return "Mag: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower;

	}
}
