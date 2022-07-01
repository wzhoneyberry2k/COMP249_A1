// -------------------------------------------------------
// Assignment 1
// Question: Part 1 (LadderAndSnake)
// Written by: William Zicha ID: 40127016
// -------------------------------------------------------
public class Player {

	private int currentTile;
	private String name;
	private int number;

	/**
	 * Constructor
	 * 
	 * @param playerName
	 *            name of a Player.
	 * @param player's
	 *            number (1-4 according to the Player 1-4).
	 **/
	public Player(String playerName, int nb) {
		currentTile = 0;
		name = playerName;
		number = nb;
	}

	/**
	 * Copy Constructor
	 * 
	 * @param playerX
	 *            player that is being copied.
	 **/
	public Player(Player playerX) {
		this.currentTile = playerX.getCurrentTile();
		this.name = playerX.getName();
		this.number = playerX.getNumber();
	}

	/**
	 * Getter for player's number.
	 * 
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter of player number
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Advances player's tiles by the number given.
	 * 
	 * @param roll
	 *            number of tiles by which to advance player's tile.
	 */
	public void advanceTiles(int roll) {
		currentTile += roll;
	}

	/**
	 * Setter for the current tile of this player.
	 * 
	 * @param newTile
	 *            the new tile
	 **/
	public void setCurrentTile(int newTile) {
		currentTile = newTile;
	}

	/**
	 * Getter for the name of this player.
	 * 
	 * @return int: the current tile
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Setter for name of this player.
	 * 
	 * @param givenName
	 *            the name
	 **/
	public void setName(String givenName) {
		name = givenName;
	}

	/**
	 * Getter for tile.
	 * 
	 * @return int: the current tile
	 **/
	public int getCurrentTile() {
		return currentTile;
	}
}
