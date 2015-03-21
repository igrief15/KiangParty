import java.util.ArrayList;
public class Board
{
  ArrayList<Position> map = new ArrayList<Position>();
  public void createBoard()
  {

    for(int i = 0; i < 10; i++) //iterates through a loop, adding positions to it EXCEPT map.size() HAS NOTHING IN IT SO IT DOESNT ITERATE
    {
      int tempval = i+1;
      int temptyp = (int)Math.random()*10;
      Position p = new Position(i,""+tempval,temptyp);
      map.add(p);
    }
    return;
  }
  
   public void addPos(int index, String value, int type) {
        map.add(new Position(index, value, type));
    }

    public Position getPos(int index) {
        return map.get(index);
    }
  
  public void drawBoard() //you cant draw what doesnt exist so where are these position strings coming from? 
  {
    for(Position K : map)
    {
      System.out.println("index = " + K.getIndex() + ", value = " + K.getValue() + ", type = " + K.getType());
    }
  }
  
}









/*
 * 
 * 
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
 
 */