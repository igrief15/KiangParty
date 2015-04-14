import java.util.Scanner;
public class GameDriver
{
  
  GamePlayer game = new GamePlayer();
  
  public GameDriver(String oneName, String twoName){
  }
  
  public GameDriver(){
  }
  
  
  
  
  public int playDiceGame(String oneName, String twoName){
    System.out.println("[DICE GAME]"); 
    System.out.println("Roll the highest number!");
    //player one
    System.out.println(oneName + ", roll the dice!"); 
    //cont.continueKey();
    int oneRoll = game.diceGame();
    System.out.println(oneName + " rolled a " + oneRoll); 
    //player two
    System.out.println(twoName + ", roll the dice!"); 
    //cont.continueKey();
    int twoRoll = game.diceGame();
    System.out.println(twoName+ " rolled a " + twoRoll);
    if(oneRoll>twoRoll){
      System.out.println(oneName +" wins!");
      //cont.continueKey();
      return 1;
    }
    else{
      System.out.println(twoName+ " wins!");
      //cont.continueKey();
      return 2;
    }
  }
  
  
  
  
  public int playNim(String oneName, String twoName){
    System.out.println("[NIM]"); 
    System.out.println("Take the last piece!");
    Scanner keyboard = new Scanner(System.in);
    boolean win = false;
    boolean pOne = true;
    int pieces = 12;
    int move = 0;
    System.out.println("There are " + pieces + " pieces.");
    while (pieces > 0){ //when the last piece is taken
      //player one
      if (pOne == true){
        System.out.println(oneName + ", enter your move: ");
        pOne = false;
      }
      else{
        System.out.println(twoName + ", enter your move: ");
        pOne = true;
      }
      pieces -= game.nim();
      if(pieces == 1)
        System.out.println("There is " + pieces + " piece left.");
      else
        System.out.println("There are " + pieces + " pieces left.");
    }
    //exits the loop when the last piece is taken, the person who takes the last piece wins, so the opposite player of the boolean wins
    if(pOne == true){//p2 wins
      System.out.println(twoName + " wins!");
      return 2;
    }
    else{
      System.out.println(oneName + " wins!");
      return 1;
    }
    
  }
  
  
  
  public int playGuessNumber(String oneName, String twoName)
  {
    System.out.println("[GUESS NUMBER]"); 
    System.out.println ("Guess the integer between 1 and 10.");
    int answer = (int)(Math.random()*10+1);//random number is from 0-1, * 10, and add 1 because int
    boolean pOne = true;
    boolean won = false;
    while (won == false)
    {
      
      //player one
      if (pOne == true){
        System.out.println(oneName + ", what is your guess?");
        pOne = false;
      }
      else{
        System.out.println(twoName + ", what is your guess?");
        pOne = true;
      }
      if(game.guessNumber() == answer)
        won = true;
    }
    
    if(pOne == true){//p2 wins
      System.out.println(twoName + " wins!");
      return 2;
    }
    else{ //p1 wins
      System.out.println(oneName + " wins!");
      return 1;
    }
  }
}



