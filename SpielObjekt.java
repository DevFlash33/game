package game.togheter.de;

import java.awt.*;
import java.util.Random;
/**
 * Daher sollte man die anderen Objekte auslagern und dieneuen Klassen
 * von dieser hier erben lassen.
 *
 * Beispiel: Da alle Attribute hier offensichtlich eine Position hatten,
 * kann man Spielobjekt als "Parent-" KLasse erstellen, von denen andere
 * Spielobjekte erben.
 *
 * Wir erstellen drei weitere Objekte(Gold, Tuer, Stun)
 * die von Spielobjekt erben. Zumindest theoretisch.
 *
 * Wir erstellen aber nur für Gold eine weitere Klasse, da diese ein zus�tzliches
 * Attribut hat. Tuer und Stun haben hier einfach nur eine Position, dadurch
 * ist es unnötig für diese beiden eine KLasse zu erstellen. Wenn wir nun eine T�r,
 * oder Stun erstellen wollen, schreiben wir:
 *
 * SpielObjekt tuer = new SpielObjekt();
 *
 * Um die Position etwas dynamischer zu machen, geben wir dem Konstruktor zwei werte.
 * Der erste Wert ist die maximale zufallszahl f�r die x position und der zweite Werte
 * die maximale zufallszahl f�r die y Position
 */
public class SpielObjekt {
    private static Random rnd = new Random();
    /**
     * Hierdurch erhalten ALLE Klassen, die von Spielobjekt erben eine Position.
     */
    private Point position;
    public SpielObjekt(int maxX, int maxY) {
        position = new Point(rnd.nextInt(maxX), rnd.nextInt(maxY));
    }
    public void setzeNeuePosition(int x, int y) {
        position.setLocation(x, y);
    }
    public Point erhaltePosition() {
        return position;
    }
    /**
     * Da wir oefter die Position des Spielobjektes aendern,
     * implementieren wir hier eine Methode, die es uns vereinfach
     * die Positionen zu veraendern. Hierbei koennen wir entweder
     * positive oder negative Werte angeben um die Position zu veraendern
     */
    public void veraendereXPositionUm(int aendereXPositionUm) {
        position.x += aendereXPositionUm;
    }
    public void veraendereYPositionUm(int anedereYPositionUm) {
        position.y += anedereYPositionUm;
    }
}