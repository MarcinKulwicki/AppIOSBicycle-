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
		if (super.hp == 12) {
			super.hp += 1;
		}
		//Sila ataku
		if (super.hitPower == 8 && super.hitPower == 10 && super.hitPower == 12) {
			super.hitPower += 1;
		}
	}

	@Override
	protected void getInfo() {
		System.out.println("Assain: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower);
	}

}
