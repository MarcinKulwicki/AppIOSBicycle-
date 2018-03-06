package Rozgrywka;



public class Orc extends Potwory {

	Orc(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		super.hitPower = 2 + (dif * 4);
		super.hpSpawn = super.hitPower;
		super.lvl = 1 * dif;
		super.exp = 15 * dif;
	}
	
	@Override
	protected void getInfo() {
		System.out.println("Orc || " + (int)super.hitPower + " Hit Power LVL: " + (int)super.lvl);	
	}
}
