package Rozgrywka;

import java.util.Random;

public class Mag extends Postac {
	private double hp;
	private double maxHp;
	private double lvl;
	private double exp;
	private double hitPower;
	private String name;

	Mag(String n) {
		this.name = n;
		this.hp = 80;
		this.maxHp = 80;
		this.lvl = 0;
		this.exp = 0;
		this.hitPower = 7;
	}

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

	public void lvlUp() {
		this.maxHp += 8;
		this.hp = this.maxHp;
		this.hitPower += 12;
	}
	
	public double expUp(double expUp) {
		this.exp += expUp;
		double expUNeed = 50+((this.lvl+1)*15);
		if(this.exp >= expUNeed){
			this.exp = 0;
			this.lvl += 1;
			this.lvlUp();
		}
		return expUNeed;
	}

	public void getInfo() {
		//System.out.println("Mag: " + this.name + " HP: " + this.hp + " LVL: " + this.lvl + " EXP: " + this.exp
		//		+ " ATT: " + this.hitPower);
		System.out.println("Mag: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower);

	}
	double getHP() {
		return this.hp;
	}
	void healUP() {
		this.hp += 10;
	}
}
