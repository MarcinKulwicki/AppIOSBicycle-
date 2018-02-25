package Rozgrywka;

import java.util.Scanner;

public class ManuFight {
	private Scanner read = new Scanner(System.in);
	
	ManuFight(){
		
	}
	
	
	public Postac singleFight(Postac Hero, Potwory Monster) {
		Fight walka = new Fight();
		walka.doFight(Hero, Monster);
		return Hero;
	}
	
	
	public void manuFight () {
		//Tworzy defaultowe obiekty 
		Postac Hero = new Mag("Karolina");
		Potwory Monster = new Troll(1);
		
		//Tworzy postac bohatera
		CreateChar createChar = new CreateChar();
		Hero = createChar.createChar("Marcin");
		Hero.getInfo();
		
		//Tworzy potwora
		Monster = createChar.createMonster();
		
		Monster.getInfo();
		
		int i=0;
		do {
			
			if(i != 1 && i !=2) {
		System.out.println("1: Walcz 2: Zmień przeciwnika");
		i = read.nextInt();
			}
		
		
		switch(i-1) {
		case 0:
			//Walka
			this.singleFight(Hero, Monster);
			Monster.spawn();
			
			break;
		case 1:
			//Zmiana przeciwnika
			Monster = createChar.createMonster();
			
			break;
		
		}
		i = 0;
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
		Hero.getInfo();
		Monster.getInfo();
		}while (i != 1 && i != 2);
	}	
	
	
	//Chce zrobic prywatne metody do pojedynczejWalki oraz do wyboru poziomu Trolla badz Orca 
	//oraz publiczna metode ktora bedzie wywolywala te metody w zaleznosci od wyboru usera

}
