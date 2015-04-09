import java.util.Scanner;
public class GameDriver
{
  GamePlayer play = new GamePlayer();
  
  public int getGame(String oneName, String twoName){  //get type of game
  int random = (int)(Math.random()*10);
    
    if (random < 4) //random dice roll for game selection
    {
      return play.Nim(oneName, twoName);
    }
    else if (random < 7)
    {
      return play.diceGame(oneName, twoName);
    }
    else if (random <10)
    {
      return play.guessNumber(oneName, twoName);
    }
    else
      return 0;
  }
  
}



