import java.util.Scanner;
public class GameDriver
{
  
 // Board cont = new Board();  
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
    while (pieces > 1){
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
  
  
  /*
  public int playGuessNumber(String oneName, String twoName)
  {
    System.out.println("[GUESS NUMBER]"); 
    System.out.println ("Guess the integer between 1 and 10.");
    //couldn't find a good way to select the range due to the random number generator thing
    Scanner keyboard = new Scanner(System.in);
    int answer = (int)(Math.random()*10+1);//random number is from 0-1, * 10, and add 1 because int
    boolean won = false; //keeps track of whether game is won
    int winner = 0; 
    boolean choice = false;
    while (choice == false) //a loop so the game still works if they don't input specifically 'human' or 'computer'
    {
      //create a loop that continues until player guesses correct answer
      while (won==false)
      {
        System.out.println (oneName + ", what is your guess?"); //make sure it works with non integers and stuff
        int guess = 0;
        if(keyboard.hasNextInt()) { //from stack overflow
          guess = keyboard.nextInt();
          if(!(guess==1||guess==2||guess==3||guess==4||guess==5||guess==6||guess==7||guess==8||guess==9||guess==10)){
            System.out.println("Please enter an integer between 1 and 10.");
            guess = keyboard.nextInt();
          }
        }
        
        if (guess==answer) {
          winner = 1;
          won = true;
        }
        else {
          System.out.println (twoName + ", what is your guess?"); //make sure it works with non integers and stuff
          if(keyboard.hasNextInt()) { //from stack overflow
            guess = keyboard.nextInt();
            if(!(guess==1||guess==2||guess==3||guess==4||guess==5||guess==6||guess==7||guess==8||guess==9||guess==10)){
              System.out.println("Please enter an integer between 1 and 10.");
              guess = keyboard.nextInt();
            }
          }
          if (guess==answer) {
            won = true;
            winner = 2;
          }
        }
        
        
      }
    }
    if (winner == 1){
      System.out.println(oneName + " wins!");
      //cont.continueKey();
      return 1;
    }
    else {
      System.out.println(twoName + " wins!");
      //cont.continueKey();
      return 2;
    }
  }
  
  */
  }



