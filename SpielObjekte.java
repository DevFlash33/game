package game.togheter.de;

import java.util.Random;

public class SpielObjekte {

	Random r = new Random();

	java.awt.Point goldPosition = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point goldPosition2 = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point goldPosition3 = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point doorPosition = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point StunPosition = new java.awt.Point(r.nextInt(40), r.nextInt(10));

	boolean Gold1Eingesammelt = false;
	boolean Gold2Eingesammelt = false;
	boolean Gold3Eingesammelt = false;

}
