package Rozgrywka;


class Rozgrywka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		ManuFight start = new ManuFight();
		start.manuFight();
		

	}
}


/* 
instanceof ( np. if (osoba[i] instanceof Osoba ) czy zmienna osoba[i] jest instancja klasy Osoba
wtedy jezeli zrobimy tablice potworów (10) elementów a zostanie wygenerowane tylko 5
 to postac bedzie walczyc z 5 potworami i nie wysypie się na 6 potworze ktory nie zostal wygenerowany 
 */

/*
Rzutowanie w dol. Zeby wywolac funkcje ktora jest tylko w klasie dziecka, nie jest widziana przez rodzica tzn
Rodzic zmienna = new Dziecko(); dziecko ma metode placz ale Rodzic jej nie ma wiec ((Dziecko)zmienna).placz();
Z orka albo trolla moze losowo wyleciec przedmiot (Armor, Tarcza, Topór, Miecz
*/