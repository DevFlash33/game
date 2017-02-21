package game.togheter.de;

import java.awt.Point;

public class SpielFeld {
	Spieler player = new Spieler();
	Schlange schlange = new Schlange();
	SpielObjekte spielObjekte = new SpielObjekte();

	public void abfrage() { // Überprüfung des Spiels
		if (spielObjekte.Gold1Eingesammelt && spielObjekte.Gold2Eingesammelt && spielObjekte.Gold3Eingesammelt
				&& player.playerPosition.equals(spielObjekte.doorPosition)) {
			System.out.println("Gewonnen!");
			player.ende = true; // beende das game
		}
		if (player.playerPosition.equals(schlange.snakePosition)) {
			System.out.println("Die Schlange hat dich!");
			player.ende = true; // beende das game
		}
		if (player.playerPosition.equals(schlange.snakePosition2)) {
			System.out.println("Die Schlange hat dich!");
			player.ende = true; // beende das game
		}
		if (player.playerPosition.equals(schlange.snakePosition3)) {
			System.out.println("Die Schlange hat dich!");
			player.ende = true;// beende das game
		}
		if (player.playerPosition.equals(schlange.snakePosition4)) {
			System.out.println("Die Schlange hat dich!");
			player.ende = true; // beende das game
		}
		if (player.playerPosition.equals(spielObjekte.goldPosition)) {
			spielObjekte.Gold1Eingesammelt = true;
			spielObjekte.goldPosition.setLocation(-1, -1);
		}
		if (player.playerPosition.equals(spielObjekte.goldPosition2)) {
			spielObjekte.Gold2Eingesammelt = true;
			spielObjekte.goldPosition2.setLocation(-1, -1);
		}
		if (player.playerPosition.equals(spielObjekte.goldPosition3)) {
			spielObjekte.Gold3Eingesammelt = true;
			spielObjekte.goldPosition3.setLocation(-1, -1);
		}
		if (player.playerPosition.equals(spielObjekte.StunPosition)) {
			schlange.schlangenBewegung = false;
			spielObjekte.StunPosition.setLocation(-1, -1);
		}
	}

	public void spielfeldErstellen() {

		for (byte y = 0; y < 10; y++) { // Y sind 10 Punkte
			for (byte x = 0; x < 40; x++) { // X sind 40 Punkte
				Point p = new Point(x, y);
				if (player.playerPosition.equals(p)) // generierung der Objekte
					System.out.print('P');
				else if (schlange.snakePosition.equals(p))
					System.out.print('S');
				else if (schlange.snakePosition2.equals(p))
					System.out.print('S');
				else if (schlange.snakePosition3.equals(p))
					System.out.print('s');
				else if (schlange.snakePosition4.equals(p))
					System.out.print('s');
				else if (spielObjekte.goldPosition.equals(p))
					System.out.print('G');
				else if (spielObjekte.goldPosition2.equals(p))
					System.out.print('G');
				else if (spielObjekte.goldPosition3.equals(p))
					System.out.print('G');
				else if (spielObjekte.doorPosition.equals(p))
					System.out.print('#');
				else if (spielObjekte.StunPosition.equals(p))
					System.out.print('!');
				else
					System.out.print('.');
			}
		}
}
}