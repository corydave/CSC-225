public class Battle {

  public Battle() {
  }
  
  public Battle(Character playerOne, Character playerTwo) {
  
  /*
   * This instantiation will bring both players into the arena
   */
   
  }
  
  public Character[] superSmash() {
   
  /*
   * One of the players will randomly be selected to go first
   * 
   * The battle will begin, and consists of a multiple rounds. Each wround will:
   *   1 - Collect the vital stats from each character and report to the other character
   *   2 - Algorithmically, the specialEffect() method may be called on one or both Characters
   *   3 - The first player will attack the second player
   * . 4 - The battle is over if the health of the second player is 0 or below
   *   5 - The second player will attack the first player
   *   6 - The battle is over if the health of the first player is 0 or below
   *  
   *   The battle will repeat until a health check returns 0 or below.
   * 
   *   An array (of size 2) will be returned, index 0 contains the winner and 
   *   index 1 contains the loser.
   *
   * The vital stats for each character will be collected, stored into an array, and sent to 
   * the opposing Character. That is, there is a method called getOppInfo(Character)
   * that will be called by each of the Characters in the Battle class.
   *
   * The array will be of type int and have the following structure:
   *       [currentHealth, maxHealth, strength, defense, special, points]
   *
   * 
   */
  
  
  }
