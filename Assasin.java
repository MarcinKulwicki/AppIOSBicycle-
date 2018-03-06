package Rozgrywka;


class Assasin extends Postac{
	
	private String name;

	Assasin(String n) {
		super();
		this.name = n;
		super.hp = 3;
		super.maxHp = 3;
		super.hitPower = 5;
		
	}
	
	@Override
	protected void lvlUp() {
		super.maxHp += 1;
		super.hp = this.maxHp;
		super.hitPower += 1;
		
		//HP
		if (super.lvl == 8) {
			super.hp += 1;
			super.maxHp += 1;
		}
		//Sila ataku
		if (super.lvl == 4 || super.lvl == 6 || super.lvl == 8) {
			super.hitPower += 1;
		}
	}

	@Override
	public String toString() {
		return "Assain: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower;
	}

}
