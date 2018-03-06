package Rozgrywka;

import java.util.Scanner;

public class CreateChar {
	private int choseChar;
	private int choseMonster;
	private int monsterLvl;
	private Scanner read = new Scanner(System.in);
	
	
	CreateChar(){
		this.monsterLvl = 1;
		System.out.println("Witam w grze zabij Orca albo Trola");
	}
	
	//*********Tworzenie postaci Bohetera
	Postac createChar (String name) {
		
		this.choseChar();
		
		switch (this.choseChar) {
		case 0:
			Postac Hero1 = new Warrior(name);
			return Hero1;
			
		case 1:
			Postac Hero2 = new Mag(name);
			return Hero2;
		case 2:
			Postac Hero3 = new Assasin(name);
			return Hero3;
	}
		//Randomowy bohater
		Postac Hero0 = new Warrior(name);
		return Hero0;
	}
	//************ metoda do wyboru postaci wywolanie jej jest w metodzie Tworzenia postaci Bohatera
		int choseChar() {
			System.out.println("Wybierz postac: 1. Warrior 2.Mag 3. Assasin");
			int chose;
			
			int i;
			do {
				chose = this.read.nextInt();
				i = chose;
				this.choseChar = i-1;
				
				}
			while (i != 1 && i != 2 && i != 3);
			return this.choseChar;
		}
	
	
	//*********Tworzenie przeciwnika (potwora)
	Potwory createMonster () {
		
		this.choseMonster();
		
		switch (this.choseMonster) {
		case 0:
			Potwory Monster1 = new Troll(this.monsterLvl);
			return Monster1;
		case 1:
			Potwory Monster2 = new Orc(this.monsterLvl);
			return Monster2;
		case 2:
			Potwory Monster3 = new Monk(this.monsterLvl);
			return Monster3;
		}
		Potwory Monster = new Troll(1);
		return Monster;
	}
	
	//************ metoda do wyboru typu potwora, wywolanie jej jest w metodzie tworzenia potwora
	void choseMonster() {
		int chose;
		int i;
		System.out.println("Wybierz wroga: 1. Troll 2. Orc 3. Monk");
		do {
			chose = this.read.nextInt();
			i = chose - 1;
			this.choseMonster = chose - 1 ;
		} while (i != 0 && i != 1 && i!= 2);
		
		System.out.println("Wybierz poziom wroga od 1");
		do {
			chose = read.nextInt();
			this.monsterLvl = chose;
			
		}while (this.monsterLvl >= 0 && this.monsterLvl > 150);
		
		//return this.choseMonster;
	}

}
