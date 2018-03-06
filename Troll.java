package Rozgrywka;

import java.util.Random;

class Troll extends Potwory {
	

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
	protected double dropItem() {
		Random r = new Random();
		int x = r.nextInt(10);
		if (x < 3 ) {
			//System.out.println("Wypadla Ci tarcza! + 1 do obrony");
			return 1;
		}
			return 0;
	}
	@Override
	public String toString() {
		return "Troll || " + (int)super.hitPower + " Hit Power LVL: " + (int)super.lvl;
	}

}
