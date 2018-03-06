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
		int i=0;
		//Tworzy defaultowe obiekty 
		Postac Hero = new Mag("Karolina");
		Potwory Monster = new Troll(1);
		
		//Tworzy postac bohatera
		CreateChar createChar = new CreateChar();
		Hero = createChar.createChar("Marcin");
		System.out.println(Hero);
		
		
		
		
		//Tworzy potwora
		Monster = createChar.createMonster();
		
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
		System.out.print(Hero);
		System.out.println(Monster);
		
		i=0;
		do {
			
			if(i != 1 && i !=2) {
		System.out.println("1: Walcz 2: Zmień przeciwnika 3: Ulecz sie");
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
		case 2:
			//Leczenie
			Hero.healUp();
			break;
		
		}
		i = 0;
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
		System.out.println(Hero);
		System.out.println(Monster);
		}while (i != 1 && i != 2);
	}	
	
	
	
	//Chce zrobic prywatne metody do pojedynczejWalki oraz do wyboru poziomu Trolla badz Orca 
	//oraz publiczna metode ktora bedzie wywolywala te metody w zaleznosci od wyboru usera

}
