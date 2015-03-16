
public class Game
{
  //should have a list of games, and a method to call one at random 
  int value;
  int type;
  
  int random = (int)Math.random()*10;
  
  
  
  public int getGame(){  //get type of game
    
    if (random < 2) //random dice roll for game selection
    {
      type = 5;
    }
    else if (random < 4)
    {
      type = 5;
    }
    else if (random <6)
    {
      type = 5;
    }
    else
    {
      type = 0;
    }
    return (type);
  }
  
  
}
