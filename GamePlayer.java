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
  
  
  
  public int guessNumber()
  {
    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    if(!(input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7 || input == 8 || input == 9 || input == 10)){ //if not in range
      System.out.println("Please enter an integer between 1 and 10, inclusive.");
      input = keyboard.nextInt();
    }
    return input;
  }
}
       
