package game.togheter.de;

public class Start {

	public static void main(String[] args) {
		Spieler player = new Spieler();
		Schlange schlange = new Schlange();
		SpielFeld game = new SpielFeld();

		do {
			// Anfang
			for (byte i = 0; i < 2; i++) { // Spieler züge
				game.spielfeldErstellen();
				game.abfrage();
				player.spielerBewegung(player.getSpielerEingabe());
				game.abfrage();
			}	
			
			schlange.kannSchlangeZumSpieler(schlange.schlangenBewegung);
		} while (player.ende == false);
	}
}
