
public class Test
{
  String A = "+1  [-2]  +3   +4   -5   +6   -7   +8   +9   +10";
  
  String B = "+11  -12  -13  -14 [+15] +16  -17  +18  +19  +20";
  
  String C = "+21 [-22] +23  +24  -25  +26  +27  +28  -29  +30";
  
  String D = "+31  +32  -33  -34  -35  +36 [+37] +38  +39  +40";
  
  String E = "-41  -42 [+43] -44  +45  +46  +47  +48  -49  +50";
  
  
  /* String F = "51  52  53  54  55  56  57  58  59  60";
   String G = "61  62  63  64  65  66  67  68  69  70";
   String H = "71  72  73  74  75  76  77  78  79  80";
   String I = "81  82  83  84  85  86  87  88  89  90";
   String J = "91  92  93  94  95  96  97  98  99  100";
   String K = "101 102 103 104 105 106 107 108 109 110";
   String L = "111 112 113 114 115 116 117 118 119 120";
   */
  
  public String cats(){
    String compile = A+"\n"+"\n"+B+"\n"+"\n"+C+"\n"+"\n"+D+"\n"+"\n"+E/*+"\n"+F+"\n"+G+"\n"+H+"\n"+I+"\n"+J+"\n"+K+"\n"+L*/;
    return (compile);
  }
  
  
  int [] scanned = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
  
  public String printBoard(int numRows, int numCols)
  {
    int scannedIndex = 0;//index of the 1D array
    
    for(int row = 0; row < numRows; row++)//iterates through all rows and columns of the board
    {
      for(int col = 0; col < numCols; col++)
      {
        if(row % 2 == 0) //if the row index is even (starting with the first one)
          System.out.print(scanned[scannedIndex]); //print the thing
        else //if row is odd
          System.out.print(scanned[scannedIndex]); //should be able to do it backwards
        
        scannedIndex++;
      }
    }
    return "\nIt worked";
  }
  
}
