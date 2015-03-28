
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
  
    public int diceRoll(){ //dice roll for the player, so i know what the player rolls
    int roll = (int)(Math.random()*6)+1;
    return (roll);
  }
  
  public int move(int roll){ //changes the position int of player and returns it
    position += roll;
    if(position > 30){ //29 + 3 = 32, but needs to be on space 2, so 32 - 30 = 2, space 2. 
      position = (position - 30);
    }
    else
    {
    }
    return position;
  }
  
  public void changeCoins(int coin){
    coins += coin;
  }
  
  
}
