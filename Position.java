
public class Position
{
  int index; //position in the board array, not the value it represents
  String value; //a string of the value represented on the board
  int type; //type of board position (subtract or add coin, or play game)
  
  public Position() //honestly i forgot what this is
  {
    index = 0;
    value = "1";
    type = 0;
  }
  public Position(int ind, String val) //honestly i forgot what this is
  {
    index = ind;
    value = val;
    int temp = (int)Math.random()*10;
    
    if (temp < 2) //random dice roll for position type
    {
      type = 0;
    }
    else if (temp < 4)
    {
      type = 1;
    }
    else if (temp <6)
    {
      type = 2;
    }
    else
    {
      type = 3;
    }
  }
  
  public int createPos()
  {
    Position ok = new Position(0,"1");
    return 5;
  }
  
  public int getType(){ //returns the block type of whatever space it called
    return type;
  }
  
  public String getValue(){
    return value;
  }
  
  public int getIndex(){
    return index;
  }
  
  
}
