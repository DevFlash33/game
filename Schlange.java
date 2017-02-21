package game.togheter.de;

import java.util.Random;

public class Schlange {

	Random r = new Random();

	java.awt.Point snakePosition = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point snakePosition2 = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point snakePosition3 = new java.awt.Point(r.nextInt(40), r.nextInt(10));
	java.awt.Point snakePosition4 = new java.awt.Point(r.nextInt(40), r.nextInt(10));

	boolean schlangenBewegung = true;

	public void kannSchlangeZumSpieler(boolean gehen) {
		if (gehen == true) {
			schlange1GehtZumSpieler();
			schlange2GehtZumSpieler();
			schlange3GehtZumSpieler();
			schlange4GehtZumSpieler();
		} else {
			System.out.println("Sie haben nun eine Runde mehr Zeit!");
		}
	}

	private void schlange1GehtZumSpieler() {
		Spieler player = new Spieler();

		if (player.playerPosition.x < snakePosition.x)
			snakePosition.x--;
		else if (player.playerPosition.x > snakePosition.x)
			snakePosition.x++;
		if (player.playerPosition.y < snakePosition.y)
			snakePosition.y--;
		else if (player.playerPosition.y > snakePosition.y)
			snakePosition.y++;
	}

	private void schlange2GehtZumSpieler() {
		Spieler player = new Spieler();

		if (player.playerPosition.x < snakePosition2.x)
			snakePosition2.x--;
		else if (player.playerPosition.x > snakePosition2.x)
			snakePosition2.x++;
		if (player.playerPosition.y < snakePosition2.y)
			snakePosition2.y--;
		else if (player.playerPosition.y > snakePosition2.y)
			snakePosition2.y++;
	}

	private void schlange3GehtZumSpieler() {
		Spieler player = new Spieler();

		if (player.playerPosition.x < snakePosition3.x)
			snakePosition3.x--;
		else if (player.playerPosition.x > snakePosition3.x)
			snakePosition3.x++;
		if (player.playerPosition.y < snakePosition3.y)
			snakePosition3.y--;
		else if (player.playerPosition.y > snakePosition3.y)
			snakePosition3.y++;
	}

	private void schlange4GehtZumSpieler() {
		Spieler player = new Spieler();

		if (player.playerPosition.x < snakePosition4.x)
			snakePosition4.x--;
		else if (player.playerPosition.x > snakePosition4.x)
			snakePosition4.x++;
		if (player.playerPosition.y < snakePosition4.y)
			snakePosition4.y--;
		else if (player.playerPosition.y > snakePosition4.y)
			snakePosition4.y++;
	}

}
