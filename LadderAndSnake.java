
// -------------------------------------------------------
// Assignment 1
// Question: Part 1 (LadderAndSnake)
// Written by: William Zicha ID: 40127016
// -------------------------------------------------------
import java.util.Scanner;

public class LadderAndSnake {

	// LadderAndSnake object has board of 10x10 (2-D array) and number of players
	// attached to it

	// Number of players must be between 2 and 4 inclusively set through use of
	// parameterized constructor of class
	// array of players to store 2-4 players
	private Player[] players;

	public LadderAndSnake(int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		gameOn = true;
	}
	// flipDice method, return random value between 1 and 6 inclusively

	public int flipDice() {
		return (int) (Math.random() * 6 + 1);
	}

	// play method, initiate the core engine of the game where players start
	/**
	 * Plays the turn of the player given
	 * 
	 * @param player
	 *            the player that needs to play their turn
	 */
	public void playerTurn(Player player) {
		// Rolling the dice and advancing the player by the amount rolled.
		int diceRoll = flipDice();
		player.advanceTiles(diceRoll);
		// Checking if a player has won the game
		checkGame();

		// If the new tile of the player is above 100, then advance by the difference
		// between the previous tile
		// and 100. Then go backwards by the dice roll minus the difference.
		if (player.getCurrentTile() > 100) {
			int previousTile = player.getCurrentTile() - diceRoll;
			int tilesForward = 100 - previousTile;
			int tilesBackwards = diceRoll - tilesForward;
			System.out
					.println(player.getName() + " rolled " + diceRoll + ". They would exceed 100 so they move forward "
							+ tilesForward + " tiles, then move backwards " + tilesBackwards + " tiles.");
			player.setCurrentTile(100 - tilesBackwards);
			System.out.println("They end at the tile number " + player.getCurrentTile());
		}

		else {
			System.out.println(player.getName() + " rolled " + diceRoll + ". They move " + diceRoll + " tiles forward,"
					+ " landing on tile " + player.getCurrentTile() + ".");
		}
		consequence(player);
	}

	/**
	 * Performs action that follow the player's current case. (If there is the head
	 * of a snake or the base of a ladder, go to top of ladder or to tail of snake)
	 * 
	 * @param player
	 *            player that rolls consequences need to be printed and put in
	 *            effect
	 */
	public void consequence(Player player) {
		// Check if the player is on the base of a ladder and updates and prints if they
		// are.
		int playerTile = player.getCurrentTile();
		for (int i = 0; i < ladders.length; i++) {
			if (playerTile == ladders[i][0]) {
				player.setCurrentTile(ladders[i][1]);
				System.out.println("This tile has the base of a ladder! " + player.getName() + " climbs all the way to "
						+ "Tile " + player.getCurrentTile() + ".");
				break;
			}
		}
		// Check if a player won the game. Possible to happen if a player used a
		// ladder on tile 80.
		checkGame();

		// Check if the player is on head of a snake and updates and prints if they are
		for (int i = 0; i < snakes.length; i++) {
			if (playerTile == snakes[i][0]) {
				player.setCurrentTile(snakes[i][1]);
				System.out.println("This tile has the head of a snake! " + player.getName() + " slides all the way to "
						+ "Tile " + player.getCurrentTile() + ".");
				break;
			}
		}
	}

	/**
	 * Check if one of the player is on tile 100. If one is, then the game is over
	 * and record winner's name.
	 */
	public void checkGame() {
		for (int i = 0; i < players.length; i++) {
			if (players[i].getCurrentTile() == 100) {
				gameOn = false;
				winnerName = players[i].getName();
			}
		}
	}

	/**
	 * Plays this game.
	 */
	public void play() {
		setPlayers();
		System.out.println("");
		// As long as there are no winners, play the turn of each players in order.
		while (gameOn) {
			for (int i = 0; i < players.length; i++) {
				playerTurn(players[i]);
				System.out.println("");
				checkGame();
				if (!gameOn)
					break;
			}
			System.out.print(
					"If you want to print the board then continue, enter \"d\", otherwise, enter anything else : ");
			String response = keyIn.next();
			if (response.compareToIgnoreCase("d") == 0)
				draw();
		}
		// Exit message
		System.out.println("Congratulations " + winnerName + "! You have won this game of SNAKES and LADDERS!");
		draw();
		System.out.println("");
		System.out.println("We hope you guys had a great time! Bye now.");
		keyIn.close();
		System.exit(0);
	}

	/**
	 * Returns number of digits in the given number
	 * 
	 * @param nb
	 *            number of type double
	 * @return the number of digits in the number
	 */
	public int digits(double nb) {
		int digitNb = 1;
		// While the number still has decimals, multiply it by 10 until it has no
		// decimals. Add number of decimals
		// to number of total digits
		while (nb != (int) nb) {
			nb *= 10;
			digitNb++;
		}
		return digitNb;
	}

	/**
	 * Returning information of the tile that needs to be displayed when drawing the
	 * board.
	 * 
	 * @param tile
	 *            A tile between 1-100
	 * @return The string that needs to be displayed in tile
	 */
	public String tileState(int tile) {
		boolean activated = false;
		String tileStatus = "";
		for (int i = 0; i < players.length; i++) {
			if (players[i].getCurrentTile() == tile) {
				tileStatus += players[i].getNumber();
				activated = true;
			}
		}
		if (activated) {
			int originalLength = tileStatus.length();
			for (int i = 0; i < 4 - originalLength; i++)
				tileStatus += " ";
			return tileStatus;
		}
		for (int i = 0; i < ladders.length; i++) {
			if (tile == ladders[i][0] || tile == ladders[i][1]) {
				tileStatus = " L" + (i + 1) + " ";
				break;
			}
		}
		for (int i = 0; i < snakes.length; i++) {
			if (tile == snakes[i][0] || tile == snakes[i][1]) {
				tileStatus = " S" + (i + 1) + " ";
				break;
			}
		}
		if (tileStatus == "")
			tileStatus = "    ";
		return tileStatus;
	}

	/**
	 * Draws updated board of game
	 */
	public void draw() {
		for (int i = 0; i < 10; i++) {
			drawLine();

			// Prints the information of the tile and the "wall" that separates each drawn
			// tile
			for (int j = 0; j < 10; j++) {
				System.out.print("|");
				if (i % 2 != 0)
					System.out.print(tileState(100 - (i * 10) - 10 + (j + 1)));
				else
					System.out.print(tileState(100 - (i * 10) - j));
			}
			// Prints last "wall" of tile at the end of the line.
			System.out.println("|");

		}
		drawLine();
	}

	/**
	 * Draws basic line template
	 */
	private void drawLine() {
		for (int j = 0; j < 10; j++) {
			System.out.print("+");
			for (int k = 0; k < 4; k++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
	}

	/**
	 * Initializes personalized names of players and determines their order
	 */
	public void setPlayers() {
		// Prompts user of each players names, if they write default, then the
		// name is "Player x" where x is
		// player's number
		for (int i = 0; i < players.length; i++) {
			System.out.print("Please enter the name of Player " + (i + 1) + ". If you want it to be Player " + (i + 1)
					+ ", then enter \"default\" : ");
			String name = keyIn.next();
			if (name.compareToIgnoreCase("default") == 0)
				players[i] = new Player("Player " + (i + 1), i + 1);
			else
				players[i] = new Player(name + " (" + (i + 1) + ")", i + 1);

			System.out.println("Player " + (i + 1) + "'s name set to " + players[i].getName() + ".");
		}
		System.out.println("");
		System.out.println("Every player will now roll to determine their order. Higher rolls will go before lower"
				+ " rolls. If multiple players roll the same they will re-roll.");

		// Array of players in correct order.
		Player[] orderedPlayers = new Player[players.length];

		// Array of type double holds dice rolls of each player. The index
		// represents the player number

		// Double so that every time a player re-rolls, they store the new re-roll as an
		// unused decimal.
		double[] diceRoll = new double[players.length];
		// Boolean that becomes true if all of the values in diceRoll are equal to 0.
		boolean allZero = false;

		// Every player rolls.
		for (int i = 0; i < players.length; i++) {
			diceRoll[i] = flipDice();
			System.out.println(players[i].getName() + " rolled " + (int) diceRoll[i] + ".");
		}

		while (!allZero) {
			// max value of diceRoll.
			double max = 0;

			// Amount of players that have a value equal to the max. If its equal to 1 then
			// its unique.
			int count = 0;

			// The index of the first value that was equal to max
			int index = 0;

			// Goes through the diceRoll array and records the max and if its unique or not.
			for (int i = 0; i < diceRoll.length; i++) {
				if (diceRoll[i] == 0)
					continue;
				else if (diceRoll[i] > max) {
					max = diceRoll[i];
					count = 1;
					index = i;
				} else if (diceRoll[i] == max)
					count++;
			}

			// If unique, assign player to first null element of
			// orderedPlayers array.
			if (count == 1) {
				diceRoll[index] = 0;
				for (int i = 0; i < orderedPlayers.length; i++) {
					if (orderedPlayers[i] == null) {
						orderedPlayers[i] = new Player(players[index]);
						System.out.println("");
						System.out.print(orderedPlayers[i].getName() + " will go ");
						switch (i) {
						case 0:
							System.out.println("first.");
							break;
						case 1:
							System.out.println("second.");
							break;
						case 2:
							System.out.println("third.");
							break;
						case 3:
							System.out.println("fourth.");
							break;
						}
						break;
					}
				}
			}
			// if not unique, then break tie between all rolls that are
			// equal to the max and record
			// the new roll as new decimal.
			else {
				System.out.println("");
				System.out.println("Attempting to break the tie!");
				for (int i = 0; i < diceRoll.length; i++) {
					if (diceRoll[i] == max) {
						int roll = flipDice();
						System.out.println(players[i].getName() + " rolled " + roll + ".");
						diceRoll[i] += roll / (Math.pow(10, digits(diceRoll[i])));
					}

				}
			}

			int zeroCount = 0;
			for (int i = 0; i < diceRoll.length; i++) {
				if (diceRoll[i] == 0)
					zeroCount++;
			}
			if (zeroCount == diceRoll.length)
				allZero = true;
		}
		// Assign initial player array equal to
		// properly ordered one.
		players = orderedPlayers;
	}

	// (bottom of ladder or head of snake) and the second is tile you land on
	// from stepping on first value.
	public int[][] ladders = { { 1, 38 }, { 4, 14 }, { 9, 31 }, { 21, 42 }, { 28, 84 }, { 36, 44 }, { 51, 67 },
			{ 71, 91 }, { 80, 100 } };
	public int[][] snakes = { { 16, 6 }, { 64, 19 }, { 95, 24 }, { 48, 30 }, { 64, 60 }, { 93, 68 }, { 97, 76 },
			{ 98, 78 } };
	// Boolean is initialized to true. It becomes false when this happens when
	// a player is on tile 100.
	private boolean gameOn;
	// name of the winner.
	private String winnerName;
	// initializing the scanner
	Scanner keyIn = new Scanner(System.in);

}