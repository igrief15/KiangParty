
public class Position
{
  int index; //position in the board array, not the value it represents
  String display; //a string of the value represented on the board
  String type; //type of board position (subtract or add coin, or play game)
  int function;
  
  public Position() //default constructor
  {
    index = 0;
    display = "1";
    function = 0;
  }
  public Position(int ind, String dis, int typ) //constructor with all 3 parameters for instance variables
  {
    index = ind;
    display = dis;
    function = typ;
    
    if (typ < 2) //random dice roll for position type
    {
      display = "" + display;
    }
    else if (typ < 4)
    {
      display = "+" + display;
    }
    else if (typ <6)
    {
      display = "-" + display;
    }
    else
    {
      display = "[" + display;
    }
  }
  
  public void assignDisplay(String dis){//not sure if i need to change index or value to fit the board layout
    display = dis;
  }
  
  public String getType(){ //returns the block type of whatever space it called
    return type;
  }
  
  public int getFunction(){//should return either a coin value or call a game
    if(function == 0){
      return 0;
    }
    else if(function == 1){
      return 3;
    }
    else if(function == 2){
      return -3; 
    }
    else{ 
      return 0;
    }
    
  }
  
  public String getDisplay(){ //returns whatever it is that is displayed at the given position (map starts on 1)
    return display;
  }
  
  public int getIndex(){ //returns true index of the space (might be obsolete, not sure how i am going to create the map)
    return index;
  }
  
  
}
