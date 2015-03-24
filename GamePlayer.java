import java.util.Scanner;
public class GamePlayer{
  Scanner kb = new Scanner(System.in);
  public GamePlayer(){
  }
  public GamePlayer(int startNumPieces){
  }
  
  public int playNim(int pieces){
    if ((pieces-2)%3==0) //if computer is on one of two winning values
      return 1; //it needs to take 1
    else if ((pieces-3)%3==0)//if computer is on the second of two winning values
      return 2; //it needs to take 2
    else //if computer is on a losing number 
      return 2; //i guess he can return 2, its an arbitrary value because he will lose anyway
  }
  
  
  public int playGuess(int result)
  {
    //tell human what the result was of the last guess
    if (result == -1) {
      System.out.println("Too low!");
      System.out.println("What's your guess?"); //this string is here because it got out of order sometimes
    }
    if (result == 1) {
      System.out.println("Too high!");
      System.out.println("What's your guess?");
    }
    
    
    int humanGuess = kb.nextInt(); 
    return humanGuess; //returns guess to the GuessNumber class file
  }
  
  
}
