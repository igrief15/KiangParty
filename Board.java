import java.util.ArrayList;
public class Board
{
  ArrayList<Position> map = new ArrayList<Position>();
  public void createBoard()
  {
    
    for(int i = 0; i < 30; i++) //iterates through a loop to create 30 positions of the board
    {
      int tempDis = i+1;
      int tempType = (int)(Math.random()*10);
      Position p = new Position(i,""+tempDis,tempType);
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
    for (int i = 0; i < numRows; i++)
    {
      
    }
    
    
    String[][] mapArray = new String[numRows][numCols]; //view is a 2D array
    int mapIndex = 0;//index of the 1D array
    
    for(int row = 0; row < numRows; row++)//iterates through all rows and columns
    {
      for(int col = 0; col < numCols; col++){
        mapArray[row][col] = map.get(mapIndex).getDisplay();
        mapIndex++;
      }
    }
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
 */