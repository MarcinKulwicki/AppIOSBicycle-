package Rozgrywka;

import java.util.Random;

public class Warrior extends Postac {

	private double hp;
	private double maxHp;
	private double lvl;
	private double exp;
	private double hitPower;
	private String name;

	Warrior(String n) {
		this.name = n;
		this.hp = 120;
		this.maxHp = 120;
		this.lvl = 0;
		this.exp = 0;
		this.hitPower = 5;
		
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
		this.maxHp += 20;
		this.hp = this.maxHp;
		this.hitPower += 8;
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
		//System.out.println("Warrior: " + this.name + " HP: " + this.hp + " LVL: " + this.lvl + " EXP: " + this.exp
		//		+ " ATT: " + this.hitPower);
		System.out.println("Warrior: "+ this.name + "  ||  " + (int)this.hp + " HP LVL: " + (int)this.lvl + " EXP: " + (int)this.exp +" ATT: "
				+ (int)this.hitPower);
	}
	double getHP() {
		return this.hp;
	}
	void healUp() {
		this.hp += 10;
	}
}
