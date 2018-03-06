package Rozgrywka;



public class Troll extends Potwory {
	

	Troll(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		super.hitPower = 1 + (dif * 3);
		super.hpSpawn = super.hitPower;
		super.lvl = 1 * dif;
		super.exp = 15 * dif;
	}

	@Override
	protected void getInfo() {
		
		System.out.println("Troll || " + (int)super.hitPower + " Hit Power LVL: " + (int)super.lvl);
	}
	

}
