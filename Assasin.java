package Rozgrywka;


class Assasin extends Postac{
	
	private String name;

	Assasin(String n) {
		this.name = n;
		super.hp = 15;
		super.maxHp = 30;
		super.lvl = 0;
		super.exp = 0;
		super.hitPower = 32;
		
	}
	
	public void lvlUp() {
		this.maxHp += 10;
		this.hp = this.maxHp;
		this.hitPower += 15;
	}

	public void getInfo() {
		System.out.println("Assain: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower);
	}

}
