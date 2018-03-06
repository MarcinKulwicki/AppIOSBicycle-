package Rozgrywka;



public class Orc extends Potwory {

	Orc(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		super.hp = 20 + (dif * 15);
		super.hpSpawn = super.hp;
		super.lvl = 1 * dif;
		super.exp = 15 * dif;
		super.hitPower = 3 * dif;
	}

	public void getInfo() {
		System.out.println("Orc || " + (int)this.hp + " HP LVL: " + (int)this.lvl + " ATT: " + (int)this.hitPower);
				
	}
}
