package Rozgrywka;

public class Fight {

	Fight() {

	}

	void doFight(Postac Hero, Potwory Monster) {
		int roundValue = 0;
		double lifeTakeHeroAll = 0 , lifeTaketrollAll = 0;
		double lifeTakeHero = 0 , lifeTaketroll = 0;
		Monster.spawn();
		while (Monster.getHP() > 0 && Hero.getHP() > 0) {
			
			Monster.getHit(lifeTakeHero = Hero.setHit());
			lifeTakeHeroAll += lifeTakeHero;
			roundValue += 1;
			
			if (Monster.getHP() > 0) {
				Hero.getHit(lifeTaketroll = Monster.setHit());
				lifeTaketrollAll += lifeTaketroll;
			}
		}
		if (Hero.getHP() <= 0) 
			System.out.println("Twoj Bohater Umarl");
		else
			{
				System.out.println("**********");
				System.out.println("Walka zostala rozpoczeta");
				
				Hero.getInfo();
				Monster.getInfo();
				System.out.println("Twoj bohater sie uleczyl po wygranej walce");
				Hero.healUp();
				System.out.println("EXP jaki potrzebujesz: " + Hero.expUp(Monster.expGive()));
				Hero.getInfo();
				
				
				System.out.println("Liczba rund: " + roundValue);
				System.out.println("Potwor zabral Bohatorowi: " + lifeTaketrollAll);
				System.out.println("Bohater zabral Potworowi: " + lifeTakeHeroAll);
				
			}
			
	}

}
