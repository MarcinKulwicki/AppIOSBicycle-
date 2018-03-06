package Rozgrywka;

import java.util.Random;

abstract class Postac {
	
	protected double hp;
	protected double maxHp;
	protected double lvl;
	protected double exp;
	protected double hitPower;
	
	public double setHit() {
		Random r = new Random();
		int x = r.nextInt(7)-3;
		return this.hitPower+x;
	}

	public void getHit(double getHit) {
		this.hp -= getHit;
		if (this.hp < 0)
			this.hp = 0;
	}
	
	public double expUp(double expUp) {
		this.exp += expUp;
		double expUNeed = 50+((this.lvl+1)*15);
		if(this.exp >= expUNeed){
			this.exp = 0;
			this.lvl += 1;
			lvlUp();
		}
		return expUNeed;
	}
	public double getHP() {
		return this.hp;
	}
	public void healUp(){
		this.hp += 20;
		if (this.hp > this.maxHp) {
			this.hp = this.maxHp;
		}
	}
	
	//Nadpisane metody
	void lvlUp() {}
	void getInfo() {}
	
}
