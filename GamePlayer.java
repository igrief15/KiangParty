import java.util.Scanner;
public class GamePlayer{
  
  
  /*/////problems
   * 
   ok so i need to have an if statement for the entire player two thing
   and guess number doesn't respond and has a repeating string glitch
   
   */
  
  
  public int diceGame(){
    return (int)(Math.random()*12)+1;
  }
  
  public int nim(){
    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    if(!(input == 1 || input == 2)){
      System.out.println("Please enter 1 or 2.");
      input = keyboard.nextInt();
    }
    return input;
  }
  
  
  
  public int guessNumber(String oneName, String twoName)
  {
    System.out.println("[GUESS NUMBER]"); 
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
      return 1;
    }
    else {
      System.out.println(twoName + " wins!");
      return 2;
    }
  }
  
}
