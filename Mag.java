package Rozgrywka;



class Mag extends Postac {
	
	private String name;
	
	Mag(String n) {
		this.name = n;
		super.hp = 80;
		super.maxHp = 80;
		super.lvl = 0;
		super.exp = 0;
		super.hitPower = 7;
	}

	public void lvlUp() {
		this.maxHp += 8;
		this.hp = this.maxHp;
		this.hitPower += 12;
	}
	
	public void getInfo() {
		System.out.println("Mag: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower);

	}
}
