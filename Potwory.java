package Rozgrywka;

import java.util.Random;

public abstract class Potwory {
	
	protected double hp;
	protected double lvl;
	protected double exp;
	protected double hitPower;
	protected double hpSpawn;
	
	double setHit() {
		
		Random r = new Random();
		int x = r.nextInt(7)-3;
		return this.hitPower+x;
	}
	void getHit(double getHit){
		
		this.hp -= getHit;
		if (this.hp < 0)
			this.hp = 0;
	}

	double expGive() {
		return this.exp;
	}
	
	double getHP() {
		return this.hp;
	}
	void spawn() {
		this.hp = this.hpSpawn;
	}
	
	//Nadpisane metody
	void getInfo() {	}
}
