package Rozgrywka;

public class Fight {

	Fight() {

	}

	void doFight(Postac Hero, Potwory Monster) {

		Monster.spawn();
		double hitPowerHero = Hero.hitPower();
		double hitPowerMonster = Monster.hitPower();
		//Monster.lvl = 15;
		
		
		if (Hero.getHP() <= 0) 
			System.out.println("Twoj Bohater Umarl");
		else
			{
				System.out.println("**********");
				System.out.println("Walka zostala rozpoczeta");
				System.out.println("ATT Hero: "+ hitPowerHero + " ATT Monster: "+ hitPowerMonster);
				if (hitPowerHero > hitPowerMonster) {
					System.out.println("WYGRANA  " + "ATT Hero: "+ hitPowerHero + " ATT Monster: "+ hitPowerMonster);
					Hero.expUp(Monster.expGive());
					
					if (Monster instanceof Monk) {
						Hero.setHitPower(((Monk)Monster).effAtt());
					}
					Hero.equipment(Monster.dropItem());
					
				}else if (hitPowerHero == hitPowerMonster) {
					System.out.println("REMIS " + "ATT Hero: "+ hitPowerHero + " ATT Monster: "+ hitPowerMonster);
				}
				else if (hitPowerHero < hitPowerMonster){
					System.out.println("PRZEGRANA " + "ATT Hero: "+ hitPowerHero + " ATT Monster: "+ hitPowerMonster);
					Hero.getHit();	
				}
				
				//System.out.println("EXP jaki potrzebujesz: ");
				//Hero.getInfo();
				
			
				
			}
			
	}

}
