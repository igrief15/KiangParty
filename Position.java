
public class Position
{
  int index; //position in the board array, not the value it represents
  String display; //a string of the value represented on the board
  String type; //type of board position (subtract or add coin, or play game)
  int function; //int for how many coins? i think. I'm not sure how that works, and i think i have to change it anyway
  String tDisplay; //temporary string to switch the display value with X when occupied
  
  public Position() //default constructor
  {
    index = 0;
    display = "1";
    function = 0;
    tDisplay = "";
  }
  public Position(int ind, String dis, int typ) //constructor with all 3 parameters for instance variables
  {
    index = ind;
    tDisplay = dis; //because i need the raw display value
    if ((typ < 2)||(index==0))  //random dice roll for position type
    {
      type = " ";
      display = type + tDisplay; //nothing
      function = 0;
    }
    else if (typ < 4)
    {
      type = "+";
      display = type + tDisplay; //plus coins
      function = 1;
    }
    else if (typ <6)
    {
      type = "-";
      display = type + tDisplay; //minus coins
      function = 2;
    }
    else
    {
      type = "[";
      display = type + tDisplay; //play a game
      function = 3;
    }
  }
  
  public void assignDisplay(String dis){//not sure if i need to change index or value to fit the board layout
    display = dis;
  }
  
  public String getType(){ //returns the block type of whatever space it called
    return type;
  }
  
  public int getFunction(){//should return either a coin value or call a game
    if(function == 0){ //nothing
      return 0;
    }
    else if(function == 1){ //add coins
      return 3;
    }
    else if(function == 2){  //subtract coins
      return -3; 
    }
    else{  //play a game (not sure how that will work right now, but will return to this later)
      return 0;
    }
    
  }
  
  public String getDisplay(){ //returns whatever it is that is displayed at the given position (map starts on 1)
    return display;
  }
  
  public int getIndex(){ //returns true index of the space (might be obsolete, not sure how i am going to create the map)
    return index;
  }
  
  public void occupyOne(){ //display if position is occupied
    tDisplay = display;  //so how would i make it read XO if both players are on it
    if(function == 0){ 
        display = " X ";
      }
      else if(function == 1){ 
        display = "+X ";
      }
      else if(function == 2){  
        display = "-X ";
      }
      else{ 
        display = "[X ";
      }
    if (index<10){ //just for alignment, first 10 have more space
      display = display + " ";
    }
  }
    public void occupyTwo(){ //display if position is occupied
    tDisplay = display;  //so how would i make it read XO if both players are on it
    if(function == 0){ 
        display = " O ";
      }
      else if(function == 1){ 
        display = "+O ";
      }
      else if(function == 2){  
        display = "-O ";
      }
      else{ 
        display = "[O ";
      }
    if (index<10){ //just for alignment, first 10 have more space
      display = display + " ";
    }
  }
  public void unoccupyOne(){ //display if position no longer occupied
    if (index<10) //just for alignment, first 10 have more space
      display = " "+ tDisplay;
    else
      display = tDisplay;
  }
    public void unoccupyTwo(){ //display if position no longer occupied
    if (index<10) //just for alignment, first 10 have more space
      display = " "+ tDisplay;
    else
      display = tDisplay;
  }
}
