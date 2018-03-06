package Rozgrywka;

import java.util.Random;

class Monk extends Potwory {
	

	Monk(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		super.hitPower = 4 + (dif * 3);
		super.hpSpawn = super.hitPower;
		super.lvl = 1 * dif;
		super.exp = 15 * dif;
	}

	@Override
	protected double dropItem() {
		Random r = new Random();
		int x = r.nextInt(5)+1;
		if (x < 3 ) {
		//System.out.println("Wypadl Ci miecz! + 2 do ataku");
			return 4;
		}
			return 0;
	}
	@Override
	public String toString() {
		return "Monk || " + (int)super.hitPower + " Hit Power LVL: " + (int)super.lvl;
	}
	
	protected double effAtt() {
		Random r = new Random();
		int x = r.nextInt(35);
		if (x < 3 ) {
		System.out.println("Monk przed smiercia zwiekszył efektywnosc Twojego ataku o 1");
		return 1;
		}
		return 0;
	}

}