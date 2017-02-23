package game.togheter.de;

import java.awt.Point;

public class SpielFeld {
	Spieler player = new Spieler();
	Schlange schlange = new Schlange();
	/**
	 * Wir erstellen hier ein Array vom Typ Gold. Hier sind alle Objekte drin
	 */
	private Gold[] goldMuenzen;
	/**
	 * Hier ist es aehnlich wie mit den Muenzen
	 */
	private Schlange[] schlangen;
	private SpielObjekt tuer;
	private SpielObjekt stun;

	public SpielFeld() {
		// Erstellt drei Goldmuenzen Objekte und speichert diese in das Array
		goldMuenzen = new Gold[] { new Gold(), new Gold(), new Gold() };
		schlangen = new Schlange[] { new Schlange(), new Schlange(), new Schlange(), new Schlange() };
		/**
		 * Erstellt die beiden anderen Objekte
		 */
		tuer = new SpielObjekt(40, 10);
		stun = new SpielObjekt(40, 10);
	}

	public Schlange[] getArraySchlangen() {
		return schlangen;
	}

	public void abfrage() { // überprüfung des Spiels

		if (goldMuenzen[0].wurdeGoldEingesammelt() && goldMuenzen[1].wurdeGoldEingesammelt()
				&& goldMuenzen[2].wurdeGoldEingesammelt() && player.erhaltePosition().equals(tuer.erhaltePosition())) {
			System.out.println("Gewonnen");
			player.esIstZuende();
			;
		}
		if (player.erhaltePosition().equals(schlangen[0].erhaltePosition())) {
			System.out.println("Die Schlange hat dich!");
			player.esIstZuende();
			; // beende das game
		}
		if (player.erhaltePosition().equals(schlangen[1].erhaltePosition())) {
			System.out.println("Die Schlange hat dich!");
			player.esIstZuende();
			; // beende das game
		}
		if (player.erhaltePosition().equals(schlangen[2].erhaltePosition())) {
			System.out.println("Die Schlange hat dich!");
			player.esIstZuende();
			;// beende das game
		}
		if (player.erhaltePosition().equals(schlangen[3].erhaltePosition())) {
			System.out.println("Die Schlange hat dich!");
			player.esIstZuende(); // beende das game
		}
		if (player.erhaltePosition().equals(goldMuenzen[0].erhaltePosition())) {
			goldMuenzen[0].goldWurdeEingesammelt();
			goldMuenzen[0].setzeNeuePosition(-1, -1);
		}
		if (player.erhaltePosition().equals(goldMuenzen[1].erhaltePosition())) {
			goldMuenzen[1].goldWurdeEingesammelt();
			goldMuenzen[1].setzeNeuePosition(-1, -1);
		}
		if (player.erhaltePosition().equals(goldMuenzen[2].erhaltePosition())) {
			goldMuenzen[2].goldWurdeEingesammelt();
			goldMuenzen[2].setzeNeuePosition(-1, -1);
		}
		if (player.erhaltePosition().equals(stun.erhaltePosition())) {
			/*
			 * Alle schlangen werden mit der Methode mitStunBetaeubt()
			 * bewegungsunfähig gemacht
			 */
			for (int iSchlange = 0; iSchlange < schlangen.length; iSchlange++) {
				schlangen[iSchlange].mitStunBetaeubt();
			}
			stun.setzeNeuePosition(-1, -1);
		}
	}

	public void spielfeldErstellen() {
		for (byte y = 0; y < 10; y++) { // Y sind 10 Punkte
			for (byte x = 0; x < 40; x++) { // X sind 40 Punkte
				Point p = new Point(x, y);
				if (player.erhaltePosition().equals(p)) // generierung der
														// Objekte
					System.out.print('P');
				else if (schlangen[0].erhaltePosition().equals(p))
					System.out.print('S');
				else if (schlangen[1].erhaltePosition().equals(p))
					System.out.print('S');
				else if (schlangen[2].erhaltePosition().equals(p))
					System.out.print('s');
				else if (schlangen[3].erhaltePosition().equals(p))
					System.out.print('s');
				else if (goldMuenzen[0].erhaltePosition().equals(p))
					System.out.print('G');
				else if (goldMuenzen[1].erhaltePosition().equals(p))
					System.out.print('G');
				else if (goldMuenzen[2].erhaltePosition().equals(p))
					System.out.print('G');
				else if (tuer.erhaltePosition().equals(p))
					System.out.print('#');
				else if (stun.erhaltePosition().equals(p))
					System.out.print('!');
				else
					System.out.print('.');
			}
			System.out.println();
		}
	}
}