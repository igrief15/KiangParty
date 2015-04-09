
public class Position
{
  int index; //position in the board array, not the value it represents
  String display; //a string of the value represented on the board
  String type; //type of board position (subtract or add coin, or play game)
  int function; //int for how many coins? i think. I'm not sure how that works, and i think i have to change it anyway
  String tDisplay; //temporary string to switch the display value with X when occupied
  String oDisplay;
  int count;
  public Position() //default constructor
  {
    index = 0;
    display = "1";
    function = 0;
    tDisplay = display;
    oDisplay = display;
    count = 0;
  }
  public Position(int ind, String dis, int typ) //constructor with all 3 parameters for instance variables
  {
    index = ind;
    tDisplay = dis; //because i need the raw display value
    oDisplay = dis;
    if ((typ < 4)||(index==0))  //random dice roll for position type
    {
      type = " ";
      display = type + tDisplay; //nothing
      function = 0;
    }
    else if (typ < 7)
    {
      type = "+";
      display = type + tDisplay; //plus coins
      function = 1;
    }
    else if (typ <9)
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
      return 10;
    }
    
  }
  
  public String getDisplay(){ //returns whatever it is that is displayed at the given position (map starts on 1)
    return display;
  }
  
  public int getIndex(){ //returns true index of the space (might be obsolete, not sure how i am going to create the map)
    return index;
  }
  
  public void occupy(int player){ //display if position is occupied
    count++;
    if(count == 1){ //1 player occupying space
      
      if(player==1){ //if player 1 occupies space
        oDisplay = display;
        display = type + "X ";
        if (index<10){ //just for alignment, first 10 have more space
          display += " ";
        }
      }
      else{ //otherwise its player two, with O
        tDisplay = display; 
        display = type + "O ";
        if (index<10){ //just for alignment, first 10 have more space
          display += " ";
        }
      }
    }
    if(count ==2){ //2 players occupying space
      display = type + "XO";
      if (index<10){ //just for alignment, first 10 have more space
        display += " ";
      }
    }
  }
  
  public void unoccupy(int player){ //change display from XO to X or O
    count--;
    if(count==0){ //no player on space
      if(player == 1){ //if player one moves (not sure if it matters)
        if (index<10) //just for alignment, first 10 have more space
          display = " "+ oDisplay;
        else
          display = oDisplay;
      }
      else{ //else player two
        if (index<10) //just for alignment, first 10 have more space
          display = " "+ tDisplay;
        else
          display = tDisplay;
      }
    }
    else{ //if there is one player on space
      if(player == 1){ //if player one moves, leaves O
        display = type + "O ";
        if (index<10){ //just for alignment, first 10 have more space
          display += " ";
        }
      }
      else{ //otherwise player two moves, leaves X
        display = type + "X ";
        if (index<10){ //just for alignment, first 10 have more space
          display += " ";
        }
      }
    }
  }
}





/*//this is in the board class but it really should be here and this might be why its not working 
 * 
 int ocCount = 0; //number occupying a space
 
 
 public void occupy(int position, int player) //int player divides into one and two
 {
 if(ocCount==1) //one player on it
 map.get(position-1).occupyOne(player); 
 else //two players on it
 map.get(position-1).occupyTwo(player);
 
 }
 public void unoccupy(int position, int player)
 {
 ocCount--;
 if(ocCount==1)
 map.get(position-1).unoccupyTwo(player); //changes XO to X or O
 else
 map.get(position-1).unoccupyOne(player); //changes X or O to original value
 
 }
 
 */
