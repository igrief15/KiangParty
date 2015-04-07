import java.util.Scanner;
public class GameDriver
{
  Scanner in = new Scanner(System.in);
  //should have a list of games, and a method to call one at random 
  int game; //the index of the game that is in the game array 
  
  int random = (int)(Math.random()*10);
  
  
  
  public int getGame(){  //get type of game
    
    if (random < 2) //random dice roll for game selection
    {
      game = 5;
    }
    else if (random < 4)
    {
      game = 5;
    }
    else if (random <6)
    {
      game = 5;
    }
    else
    {
      game = 0;
    }
    return (game);
  }
  
  
  
  
  
  
  
  
  public int Nim(String oneName, String twoName){
    boolean win = false;
    int startnum = 12;
    int pieces;
    int playermove;
    pieces = startnum;
    int winner = 0;
    while (pieces > 1){
      //player one
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println(oneName + ", enter your move: ");
      playermove = in.nextInt();
      if (!((playermove == 1) || (playermove == 2))){ //checks to see if number is within range or not some dumb answer
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces <= 1){
        System.out.println(oneName + " wins!");
        winner = 1;
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      
      
      //player two
      System.out.println(twoName + ", enter your move: ");
      playermove = in.nextInt();
      if (!((playermove == 1) || (playermove == 2))){ //checks to see if number is within range or not some dumb answer
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces <= 1){
        System.out.println(twoName + " wins!");
        winner = 2;
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      
      
      }
    if(winner == 1)
      return 1;
    else
      return 2;
      
    }
 
  
  
  public int guessNumber(String oneName, String twoName)
  {
    //couldn't find a good way to select the range due to the random number generator thing
    Scanner keyboard = new Scanner(System.in);
    int answer = (int)(Math.random()*10+1);//random number is from 0-1, * 10, and add 1 because int
    boolean won = false; //keeps track of whether game is won
    int winner = 0; 
    boolean choice = false;
    System.out.println("Welcome to the game, player!");
    while (choice == false) //a loop so the game still works if they don't input specifically 'human' or 'computer'
    {
      //create a loop that continues until player guesses correct answer
      System.out.println ("I'm thinking of an integer between 1 and 10.");
      while (won==false)
      {
        System.out.println (oneName + ", what is your guess?"); //make sure it works with non integers and stuff
        int guess = Integer.parseInt(keyboard.nextLine()); //from stackoverflow
        if (guess<answer) {
          System.out.println ("Nope.");
        }
        else if (guess>answer) {
          System.out.println ("Nope.");
        }
        else {
          winner = 1;
          won = true;
        }
        
        System.out.println (twoName + ", what is your guess?"); //make sure it works with non integers and stuff
        guess = Integer.parseInt(keyboard.nextLine()); //from stackoverflow
        if (guess<answer) {
          System.out.println ("Nope.");
        }
        else if (guess>answer) {
          System.out.println ("Nope.");
        }
        else { 
          won = true;
          winner = 2;
        }
      }
    }
    if (winner == 1){
      System.out.println(oneName + " wins!");
      return 1;
    }
    else {
      System.out.println(twoName + " wins!");
      return 2;
    }
  }
}



