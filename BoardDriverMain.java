import java.util.Scanner;


public class BoardDriverMain
{ 
  public static void main(String[] args)
  {
    int roll = 0;
    Scanner keyboard = new Scanner(System.in);
    Board mario = new Board();
    mario.createBoard();
    boolean won = false;
    System.out.println("Player one, what is your name?"); //choose player name
    String name = keyboard.nextLine();
    Player one = new Player(1,name,0);
    System.out.println("Player two, what is your name?"); //choose player name
    name = keyboard.nextLine();
    Player two = new Player(1,name,0); //too much work to implement a dice roll for which player goes first
    System.out.println("First player with 10 coins wins!");
    while (won == false)
    {
      mario.drawBoard(3,10); //creates the board
      
      mario.continueKey(); //SEEMS TO NOT ALWAYS DO THIS 
      roll = one.diceRoll(); //temporary int for player one's roll
      System.out.println(one.getName()+" rolled a " + roll);
      mario.unoccupy(one.getPosition()); //calls unoccupy method
      mario.occupy(one.move(roll)); //calls occupy method
      one.changeCoins(mario.function(one.move(roll))); //calls function
      System.out.println(one.getName() + " has " + one.getCoins() + " coins.");
      System.out.println(two.getName() + " has " + two.getCoins() + " coins.");
      
      if (one.getCoins() > 5) //temporary value for testing
        won = true;
      else if(two.getCoins() > 5)
        won = true;
      else 
        won = false;
      
      mario.drawBoard(3,10); //creates the board
      
      mario.continueKey();
      roll = two.diceRoll(); //temporary int for player one's roll
      System.out.println(two.getName()+" rolled a " + roll);
      mario.unoccupy(two.getPosition()); //calls unoccupy method
      mario.occupy(two.move(roll)); //calls occupy method
      two.changeCoins(mario.function(two.move(roll))); //calls function
      System.out.println(one.getName() + " has " + one.getCoins() + " coins.");
      System.out.println(two.getName() + " has " + two.getCoins() + " coins.");
      
      if (one.getCoins() > 5)
        won = true;
      else if(two.getCoins() > 5)
        won = true;
      else 
        won = false;
    }
    
    System.out.println("Game Over");
    
  }
  /*MOVEMENT
   * can get a position int from the player class,  Ã
   * can then use that to change the display value of that particular position object - if it goes through drawBoard each time, i might just need display - 1 for index 
   * just have to be able to find the relevant object
   * then change the display value to read X or O depending
   * and then when the next turn comes around, get the position int from player class
   * change back display value
   * change the other display value
   * //display value changes by taking the temp value + X or O with another counter or something
   * ///then using a temporary variable to reset it
   */
}
