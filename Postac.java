package Rozgrywka;

import java.util.Random;

abstract class Postac {
	
	protected double hp;
	protected double maxHp;
	protected double lvl;
	protected double exp;
	protected double hitPower;
	
	Postac (){
		this.lvl = 0;
		this.exp = 0;
	}
	
	protected double hitPower() {
		Random r = new Random();
		int x = r.nextInt(6)+1;
		return this.hitPower+x;
	}

	protected void getHit() {
		this.hp -= 1;
		if (this.hp < 0)
			this.hp = 0;
	}
	
	protected double expUp(double expUp) {
		this.exp += expUp;
		double expUNeed = 50+((this.lvl+1)*15);
		if(this.exp >= expUNeed){
			this.exp = 0;
			this.lvl += 1;
			lvlUp();
		}
		return expUNeed;
	}
	protected double getHP() {
		return this.hp;
	}
	protected void healUp(){
		this.hp += 1;
		if (this.hp > this.maxHp) {
			this.hp = this.maxHp;
		}
	}
	
	//Nadpisane metody
	abstract protected void lvlUp();
	abstract protected void getInfo();
	
}
