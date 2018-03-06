package Rozgrywka;

import java.util.Random;

abstract class Potwory {
	
	protected double lvl;
	protected double exp;
	protected double hitPower;
	protected double hpSpawn;
	
	double hitPower() {
		
		Random r = new Random();
		int x = r.nextInt(6)+1;
		return this.hitPower+x;
	}

	double expGive() {
		return this.exp;
	}
	
	double gethitPower() {
		return this.hitPower;
	}
	void spawn() {
		this.hitPower = this.hpSpawn;
	}
	
	//Nadpisane
	abstract void getInfo();
}
