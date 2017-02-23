package game.togheter.de;
/**
 * Um das hier nun angenehmer zu machen, wird die klasse abstrakter gestaltet.
 * Wir beschränken uns auf die Dinge, die jede Schlange hat.
 *
 * Eine Position und eine Methode, die diese manipuliert.
 *
 * Und wenn wir sogar einen weiteren Schrit zurückgehen, sehen wir, das die
 * Schlange genaugenommen ein Spielobjekt ist. Und da wir bereits in Spielobjekt
 * die Position des Spielobjektes definiert haben, k�nnen wir dies bei der
 * Schlange weglassen und müssen nurnoch die Bewegung implementieren.
 *
 * Zusaetzlich geben wir der Schlange einen 'Flag' der angibt ob sie sich
 * bewegen kann, oder nicht. Dieser wird veraendert, wenn die Schlange betäubt
 * wird.
 */
public class Schlange extends SpielObjekt {
	private boolean bewegen = true;

	public Schlange() {
		/**
		 * Hier r�ber rufen wir den Konstruktor von SpielObjekt auf. Wenn eine
		 * Klasse von einer anderen erbt, so hat man Zugriff auf den
		 * Konstruktor.
		 */
		super(40, 10);
	}

	/**
	 * In diesem Fall ben�tigen wir nicht den Gesamten Spieler, sondern nur
	 * seine Positionen. Diese werden dann beim Aufruf der Methode �bergeben.
	 * Aktuell haben wir also nichts mit dem Spieler zu tun, sondern
	 * implementieren nur das Verhalten anhand der uebergebenen Position. Dazu
	 * erwarten wir, das alle Schlangen in Form eines Arrays von Schlange[] hier
	 * angeben werden.
	 */
	public void geheZumSpieler(int spielerXPosition, int spielerYPosition, Schlange[] schlangen) {
		// Schlange bewegt sich nur, wenn sie mit keinem Stun in Kontakt
		// gekommen ist
		if (bewegen) {
			for (byte i = 0; i < schlangen.length; i++) {
				if (spielerXPosition < schlangen[i].erhaltePosition().x) {
					/*
					 * Hier setzen wir die neue Position anhand der alten
					 * Position der Schlange
					 */
					schlangen[i].veraendereXPositionUm(-1);
				} else if (spielerXPosition > schlangen[i].erhaltePosition().x) {
					schlangen[i].veraendereXPositionUm(1);
				}

				if (spielerYPosition < schlangen[i].erhaltePosition().y) {
					schlangen[i].veraendereYPositionUm(-1);
				} else if (spielerYPosition > schlangen[i].erhaltePosition().y) {
					schlangen[i].veraendereYPositionUm(1);
				}
			}
		}
	}

	/**
	 * Wenn die Schlange mit dem Stun betäubt ist, muss diese Methode aufgerufen
	 * werden.
	 */
	public void mitStunBetaeubt() {
		bewegen = false;
	}

	/**
	 * Je nachdem wie das umgsetzt wird, kann sich die Schlange eventuell wieder
	 * nach einer Zeit bewegen. Dann solltest du diese Methode aufrufen
	 */
	public void stunVorbei() {
		bewegen = true;
	}
}
