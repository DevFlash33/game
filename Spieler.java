package game.togheter.de;

import java.util.Scanner;

public class Spieler extends SpielObjekt {
	private Scanner scan = new Scanner(System.in);
	private boolean ende = false;

	public Spieler() {
		super(40, 10);
	}

	/**
	 * @Methode zum testen ob ende false oder true ist
	 */
	public boolean testIstSpielVorbei() {
		return ende;
	}

	/**
	 * @Methode zum beenden des spiels
	 */
	public void esIstZuende() {
		ende = true;
	}

	/**
	 * @Methode zum erfassen der Spielereingabe
	 */
	public char getSpielerEingabe() {
		System.out.println(); // Zum eingeben von w,a,s,d
		char eingabe = scan.next().charAt(0);
		return eingabe;
	}

	/**
	 * @Methode um die Spieler Bewegung umzusetzen
	 */
	public void spielerBewegung(char eingabe, Spieler spieler) {
		switch (eingabe) {
		case 'w':
			spieler.veraendereYPositionUm(-1);
			break;
		case 's':
			spieler.veraendereYPositionUm(1);
			;
			break;
		case 'a':
			spieler.veraendereXPositionUm(-1);
			break;
		case 'd':
			spieler.veraendereXPositionUm(1);
			break;
		}
	}

}
