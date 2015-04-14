import java.util.Scanner;

public class BoardDriverMain
{ 
  public static void main(String[] args)
  {
    int score = 100; //score necessary to win
    int roll = 0;
    int function = 0;
    int winner = 0;
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
    mario.changeCount();
    
    System.out.println("X = " + one.getName());
    System.out.println("O = " + two.getName());
    System.out.println("If you land on a '+' space, you will get 3 coins."); //choose player name
    System.out.println("If you land on a '-' space, you will lose 3 coins."); //choose player name
    System.out.println("'[' spaces will start a minigame! The winner gets 10 coins."); //choose player name
    System.out.println("First player with " +score+ " coins wins!");
    
    while (won == false)
    {
      mario.drawBoard(3,10); //creates the board
      
      mario.continueKey(); 
      roll = one.diceRoll(); //temporary int for player one's roll
      System.out.println(one.getName()+" rolled a " + roll);
      mario.unoccupy(one.getPosition(), 1); //calls unoccupy method
      mario.occupy(one.move(roll), 1); //calls occupy method
      System.out.println(one.getName()+" is now on space " + one.getPosition());
      mario.continueKey();
      function = mario.function(one.getPosition());
      if(function == 10){
        System.out.println("Play a game!");
        winner = mario.getGame(one.getName(), two.getName());
        if(winner==1){
          System.out.println(one.getName() + " gets 10 coins!");
          one.changeCoins(function);
        }
        else{
          System.out.println(two.getName() + " gets 10 coins!");
          two.changeCoins(function);
        }
      }
      else if(function == 3){
        System.out.println(one.getName() + " gets 3 coins!");
        one.changeCoins(function);
      }
      else if(function == -3){
        System.out.println(one.getName() + " loses 3 coins!");
        one.changeCoins(function);
      }
      else{
      }
      System.out.println(one.getName() + " has " + one.getCoins() + " coins.");
      System.out.println(two.getName() + " has " + two.getCoins() + " coins.");
      
      if (one.getCoins() > score) //temporary value for testing
        won = true;
      else if(two.getCoins() > score)
        won = true;
      else 
        won = false;
      
      mario.drawBoard(3,10); //creates the board
      
      mario.continueKey();
      roll = two.diceRoll(); //temporary int for player one's roll
      System.out.println(two.getName()+" rolled a " + roll);
      mario.unoccupy(two.getPosition(), 2); //calls unoccupy method
      mario.occupy(two.move(roll), 2); //calls occupy method
      System.out.println(two.getName()+" is now on space " + two.getPosition());
      mario.continueKey();
      function = mario.function(two.getPosition());
      if(function == 10){
        System.out.println("Play a game!");
        winner = mario.getGame(one.getName(), two.getName());
        if(winner==1){
          System.out.println(one.getName() + " gets 10 coins!");
          one.changeCoins(function);
        }
        else{
          System.out.println(two.getName() + " gets 10 coins!");
          two.changeCoins(function);
        }
      }
      else if(function == 3){
        System.out.println(two.getName() + " gets 3 coins!");
        two.changeCoins(function);
      }
      else if(function == -3){
        System.out.println(two.getName() + " loses 3 coins!");
        two.changeCoins(function);
      }
      else{
      }
      System.out.println(one.getName() + " has " + one.getCoins() + " coins.");
      System.out.println(two.getName() + " has " + two.getCoins() + " coins.");
      
      if (one.getCoins() > score)
        won = true;
      else if(two.getCoins() > score)
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
