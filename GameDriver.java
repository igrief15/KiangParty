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
  
  
  
  
  public int randomNim(){
    boolean win = false;
    int startnum = 12;
    int pieces;
    int playermove;
    GamePlayer test = new GamePlayer(startnum);
    pieces = startnum;
    while (pieces > 1){
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println("Enter your move: ");
      playermove = in.nextInt();
      while ((playermove < 1) || (playermove > 2)){ //checks to see if number is within range
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces == 1){
        System.out.println("Computer loses.");
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      pieces -= test.playNim(pieces);
      if (pieces == 1){
        System.out.println("You lose.");
      }
    }
    return 0;
  }
  
  
  public int guessNumber()
  {
    //couldn't find a good way to select the range due to the random number generator thing
    int count = 0;
    Scanner keyboard = new Scanner(System.in);
    int answer = (int)(Math.random()*100+1);//random number is from 0-1, * 10, and add 1 because int
    boolean won = false; //keeps track of whether game is won
    int result = 0; //-1 is too low, 1 is too high, and 0 means begining of game
    boolean choice = false;
    while (choice == false) //a loop so the game still works if they don't input specifically 'human' or 'computer'
    {
      System.out.println("Is the player human or computer?"); //choose Player or Computer class
      String command = keyboard.nextLine(); //prompts input
      if (command.equals ("human")) //if they type 'human'
      {
        choice = true;
        GamePlayer human = new GamePlayer();
        //create a loop that continues until player guesses correct answer
        if (result == 0) System.out.println("Welcome to the game, player!");
        System.out.println ("I'm thinking of a number between 1 and 100.");
        while (won==false)
        {
          int guess = human.playGuess(result);//takes int from Player
          if (guess<answer) {
            count++;
            result = -1;
          }
          else if (guess>answer) {
            result = 1;
            count++;
          }
          else won = true; //catch-all
        }
        System.out.println("You win!");
        System.out.println("You took " + (count+1) +" tries."); //count+1 because count doesnt get updated at the end
      }
      else if (command.equals ("computer")) //if they type 'computer'
      {
        
        
        choice = true;
        GamePlayer one = new GamePlayer();
        //create a loop that continues until player guesses correct answer
        if (result == 0) System.out.println("Welcome to the game, computer!");
        System.out.println ("I'm thinking of a number between 1 and 100.");
        while (won==false)
        {
          int guess = one.playGuess(result);//takes int from Player
          //figure out whether we are too high or too low 
          if (guess<answer) {
            count++;
            result = -1;
          }
          else if (guess>answer) {
            result = 1;
            count++;
          }
          else won = true; //catch-all
        }
        System.out.println("The computer wins!");
        System.out.println("The computer took " + (count+1) +" tries"); 
      }
      else { //if they type anything that isn't 'human' or 'computer'
        System.out.println("Please input a valid response"); //loops back
      }
    }
    return 1;
  }
  
}