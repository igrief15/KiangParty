import java.util.Scanner;
public class GameDriver
{
  GamePlayer play = new GamePlayer();
  
  public void getGame(String oneName, String twoName){  //get type of game
  int random = (int)(Math.random()*10);
    
    if (random < 4) //random dice roll for game selection
    {
      play.Nim(oneName, twoName);
    }
    else if (random < 7)
    {
      play.diceGame(oneName, twoName);
    }
    else if (random <10)
    {
      play.guessNumber(oneName, twoName);
    }
  }
  
}



