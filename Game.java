package game.togheter.de;
/**
 * 
 * Klasse zum Initalisieren des Spiels, hier greift nur die Start.java drauf zu
 *	
 */
public class Game {
	/**
	 * Zum starten des spiels
	 */
	public void starteDasGame(){
	Spieler player = new Spieler();
	SpielFeld game = new SpielFeld();
	Schlange schlange = new Schlange();
	do {
		// Anfang
		for (byte i = 0; i < 2; i++) { // Spieler z�ge
			game.spielfeldErstellen();
			game.abfrage();
			player.spielerBewegung(player.getSpielerEingabe());
			game.abfrage();
		}
		schlange.geheZumSpieler(player.erhaltePosition().x, player.erhaltePosition().y, game.getArraySchlangen());
	} while (player.testIstSpielVorbei() == false);
	}
}
