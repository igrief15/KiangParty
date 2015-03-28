import java.util.ArrayList;
public class Board
{
  ArrayList<Position> map = new ArrayList<Position>();
  public void createBoard()
  {
    
    for(int i = 0; i < 30; i++) //iterates through a loop to create 30 positions of the board
    {
      int tempDis = i+1; //creates a variable for the display parameter of position object
      int tempType = (int)(Math.random()*10); //creates a variable for type parameter of position object
      Position p = new Position(i,""+tempDis,tempType); //creates a position object at index i, display i+1, and a random type
      map.add(p);
    }
    return;
  }
  
  public void addPos(int index, String display, int type) {
    map.add(new Position(index, display, type));
  }
  
  public Position getPos(int index) {
    return map.get(index);
  }
  
  
  
  public void drawBoard(int numRows, int numCols) //ok so it needs to create a few rows of strings concatenized together
  {
    String[][] mapArray = new String[numRows][numCols]; //view is a 2D array
    int mapIndex = 0;//index of the 1D array
    
    for(int row = 0; row < numRows; row++)//iterates through all rows and columns
    {
      for(int col = 0; col < numCols; col++){
        if(row % 2 == 0)
          mapArray[row][col] = map.get(mapIndex).getDisplay();
        else 
          mapArray[row][numCols - col - 1] = map.get(mapIndex).getDisplay();
        mapIndex++;
      }
    }
    int count = 0;
    int otherCount = 0; //i needed another count variable
    for(int row = 0; row < numRows; row++)//this should iterate through the 2D array, space out each column and each row. 
    {
      for(int col = 0; col < numCols; col++)
      {
        count++;
        otherCount++;
        if(otherCount < 10) //the first ten values get another space between them to align with the rest
          System.out.print(mapArray[row][col] + "     ");
        else
          System.out.print(mapArray[row][col] + "    ");
        if(count == numCols) //whenever there are 10 values in a row, it starts a new row
        {
          System.out.println("\n\n");
          count = 0;
        }
      }
    }
  }
  
  
  public int function(int position) //parameter for the specific position, so position-1 is index, call occupy method to change tDisplay to X or O
  {
    int function;
    function = map.get(position-1).getFunction();
    return function; //returns the coin value or other stuff
  }
    int ocCount = 0; //number occupying a space
  
  public void occupy(int position, int player) //int player divides into one and two
  {
    ocCount++;
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
  
  
  
   public void continueKey() //wanted to add pauses in the game so it doesnt go by in like 2 seconds, they should see what they roll, see the board change
  { 
    System.out.println("Enter any key to continue..."); //i got it from stackoverflow
    try
    {
      System.in.read();
    }  
    catch(Exception e)
    {}  
  }
}

/*
 * {
 if(row % 2 == 0) //if the row index is even (starting with the first one)
 mapArray[row][col] = map.indexOf(5); //how do i even get an element at a certain index, i forgot
 else //if row is odd
 mapArray[row][numCols - col - 1] = map.indexOf(2); //do it backwards
 
 mapIndex++;
 }
 
 
 
 skyview
 if(row % 2 == 0)
 view[row][col] = scanned[scannedIndex];
 else
 view[row][numCols - col - 1] = scanned[scannedIndex];
 
 scannedIndex++;
 */