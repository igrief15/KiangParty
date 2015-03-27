import java.util.Scanner;


public class BoardDriverMain
{ 
  public static void main(String[] args)
  {
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
    while (won == false)
    {
      mario.drawBoard(3,10);
      mario.continueKey();
      System.out.println("It works"); //DICE ROLL, DO A MOVE THING FOR ONE PLAYER? is move a board method or player method?
      won = true;
    }
    System.out.println("Game Over");
    
  }
  /*MOVEMENT
   * can get a position int from the player class, 
   * can then use that to change the display value of that particular position object
   * just have to be able to find the relevant object
   * then change the display value to read X or XX depending
   * and then when the next turn comes around, get the position int from player class
   * change back display value
   * change the other display value
   * //display value changes by taking the temp value + X or XX with another counter or something
   * ///then using a temporary variable to reset it
  */
}
