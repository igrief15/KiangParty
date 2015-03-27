
public class Player
{
  int position; //position (display) of board
  String name; //name of the player
  int coins; //number of coins
  
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
  
  public int getPosition(){
    return position;
  }
  
  public String getName(){
    return name;
  }
  
  public int getCoins(){
    return coins;
  }
  
    public int diceRoll(){ //dice roll for the player
    int roll = (int)(Math.random()*6)+1;
    return (roll);
  }
  
  public int move(){ //probably makes diceRoll obsolete, i probably don't need to have just a dice roll 
    int roll = (int)(Math.random()*6)+1;
    position += roll;
    return position;
  }
  
  
}
