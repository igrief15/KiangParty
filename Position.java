
public class Position
{
  int index; //position in the board array, not the value it represents
  String display; //a string of the value represented on the board
  int type; //type of board position (subtract or add coin, or play game)
  
  public Position() //default constructor
  {
    index = 0;
    display = "1";
    type = 0;
  }
  public Position(int ind, String dis, int typ) //constructor with all 3 parameters for instance variables
  {
    index = ind;
    display = dis;
    
    if (typ < 2) //random dice roll for position type
    {
      type = 0;
    }
    else if (typ < 4)
    {
      type = 1;
    }
    else if (typ <6)
    {
      type = 2;
    }
    else
    {
      type = 3;
    }
  }
  
  public void assignDisplay(String dis){//not sure if i need to change index or value to fit the board layout
    display = dis;
  }
  
  public int getType(){ //returns the block type of whatever space it called
    return type;
  }
  
  public String getDisplay(){ //returns whatever it is that is displayed at the given position (map starts on 1)
    return display;
  }
  
  public int getIndex(){ //returns true index of the space (might be obsolete, not sure how i am going to create the map)
    return index;
  }
  
  
}
