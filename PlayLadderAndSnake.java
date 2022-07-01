
// -------------------------------------------------------
// Assignment 1
// Question: Part 2 (PlayLadderAndSnake)
// Written by: William Zicha ID: 40127016
// -------------------------------------------------------
// This program is a Snake and Ladder Game that supports 2 to 4 players. Since the game is only based on dice rolling,
// which is pure luck, it runs and prints every roll until one of the players win.

import java.util.Scanner;

public class PlayLadderAndSnake {
	public static void main(String[] args) {
		// Initializes the Scanner
		Scanner keyIn = new Scanner(System.in);

		// Welcome prompt.
		System.out.print("Hi! Are you interested in a game of Snakes and Ladders created by William Zicha? If so, "
				+ "enter something. If not, please enter \"n\" : ");
		String userResponse = keyIn.next();
		System.out.println("");
		if (userResponse.compareToIgnoreCase("n") == 0) {
			System.out.print("Bye-bye. Have a good day!");
			keyIn.close();
			System.exit(0);
		}

		// Prompting the user for how many players they want in the game. 4
		// unsuccessful attempts, end the program.
		System.out
				.print("How many players? This game supports 2 to 4 players : ");
		int playerNb = keyIn.nextInt();
		int attempt = 0;
		while (playerNb > 4 || playerNb < 2) {
			attempt++;
			System.out.println("");
			if (attempt == 4) {
				System.out.print("Bad Attempt 4! You have exhausted all your chances. Program will terminate!");
				System.exit(0);
			}
			System.out.print("Bad Attempt " + attempt + " - This program only supports 2 to 4 players. Please enter"
					+ "a valid number of players");
			if (attempt == 3)
				System.out.print(". This is your last attempt");
			System.out.print(" : ");
			playerNb = keyIn.nextInt();
		}
		System.out.println("Starting a " + playerNb + " player game of Snakes And LADDERS!");

		// Creating a new Game
		LadderAndSnake lAndS = new LadderAndSnake(playerNb);
		lAndS.play();
	}
}
