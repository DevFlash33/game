package game.togheter.de;

import java.util.Random;
import java.util.Scanner;

public class Spieler {
	Scanner scan = new Scanner(System.in);
	
	Random r = new Random();
	
	java.awt.Point playerPosition = new java.awt.Point(10, 9);
	
	boolean ende = false;
	
	char getSpielerEingabe(){
		System.out.println(); // Zum eingeben von w,a,s,d
		char eingabe = scan.next().charAt(0);
		return eingabe;
	}
	
	void spielerBewegung(char eingabe) {
		switch (eingabe) {
		case 'w':
			playerPosition.y = Math.max(0, playerPosition.y - 1);
			break;
		case 's':
			playerPosition.y = Math.min(9, playerPosition.y + 1);
			break;
		case 'a':
			playerPosition.x = Math.max(0, playerPosition.x - 1);
			break;
		case 'd':
			playerPosition.x = Math.min(39, playerPosition.x + 1);
			break;
		}
	}

}
