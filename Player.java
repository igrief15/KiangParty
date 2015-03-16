
public class Player
{
  int position;
  String name;
  int coins;
  
  public Player()
  {
    position = 1;
    name = "Joe";
    coins = 0;
  }
  
  public Player(int p, String n, int c)
  {
    position = p;
    name = n;
    coins = c;
  }
  
  public int diceRoll(){ //dice roll for the player
    int roll = (int)Math.random()*6+1;
    return (roll);
  }
  
}
