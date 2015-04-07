import java.util.Scanner;
public class GamePlayer{
  Scanner kb = new Scanner(System.in);
  public GamePlayer(){
  }
  public GamePlayer(int startNumPieces){
  }
  
  public int nimPlayer(int pieces){
    if ((pieces-2)%3==0) //if computer is on one of two winning values
      return 1; //it needs to take 1
    else if ((pieces-3)%3==0)//if computer is on the second of two winning values
      return 2; //it needs to take 2
    else //if computer is on a losing number 
      return 2; //i guess he can return 2, its an arbitrary value because he will lose anyway
  }
  
  
  
  
}
