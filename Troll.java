package Rozgrywka;



public class Troll extends Potwory {
	

	Troll(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		super.hp = 10 + (dif * 10);
		super.hpSpawn = super.hp;
		super.lvl = 1 * dif;
		super.exp = 15 * dif;
		super.hitPower = 5 * dif;
	}


	public void getInfo() {
		
		System.out.println("Troll || " + (int)this.hp + " HP LVL: " + (int)this.lvl + " ATT: " + (int)this.hitPower);
	}
	

}
