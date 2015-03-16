
public class Board
{
  
  double [] scanned = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
  
  double[][] view;
  public Board(int numRows, int numCols) //comes from the skyview test question
  {
    view = new double[numRows][numCols]; //view is a 2D array
    
    int scannedIndex = 0;//index of the 1D array
    
    for(int row = 0; row < numRows; row++)//iterates through all rows and columns
    {
      for(int col = 0; col < numCols; col++)
      {
        if(row % 2 == 0) //if the row index is even (starting with the first one)
          view[row][col] = scanned[scannedIndex]; //ok
        else //if row is odd
          view[row][numCols - col - 1] = scanned[scannedIndex]; //do it backwards
        
        scannedIndex++;
      }
    }
  }
  
  public int createBoard()
  {
    for (int i = 0; i < 30; i++)
    {
    }
    return 5;
  }
  
  
  
  
  
  String A = " 1    2   -3    4   -5   +6   [7   +8    9   +10";
  
  String B = "+11  -12  -13  -14  [15  +16  -17  +18  +19  +20";
  
  String C = " 21 [-22  +23   24  -25  +26   27  +28  -29  +30";
  
  String D = "+31  +32  -33  -34  -35  +36  [37  +38   39   40";
  
  String E = "-41   42 [+43  -44   45   46  +47  +48  -49  +50";
  
  
  
  public String cats(){
    String compile = A+"\n"+"\n"+B+"\n"+"\n"+C+"\n"+"\n"+D+"\n"+"\n"+E;
    return (compile);
  }
}
