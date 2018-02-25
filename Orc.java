package Rozgrywka;

import java.util.Random;

public class Orc extends Potwory {
	private double hp;
	private double lvl;
	private double exp;
	private double hitPower;
	private double hpSpawn;

	Orc(double dif) {
		if (dif == 0) {
			dif = 1;
		}
		this.hp = 20 + (dif * 15);
		this.hpSpawn = this.hp;
		this.lvl = 1 * dif;
		this.exp = 15 * dif;
		this.hitPower = 3 * dif;
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

	public double expGive() {
		return this.exp;
	}

	public void getInfo() {
		//System.out.println("Name: ORC" + "HP: " + this.hp + " LVL: " + this.lvl + " ATT: " + this.hitPower);
		System.out.println("Orc || " + (int)this.hp + " HP LVL: " + (int)this.lvl + " ATT: " + (int)this.hitPower);
				
	}
	public double getHP() {
		return this.hp;
	}
	public void spawn() {
		this.hp = this.hpSpawn;
	}

}
