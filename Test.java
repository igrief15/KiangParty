
public class Test
{
  public int Nim(String oneName, String twoName){
    System.out.println("[NIM]"); 
    Scanner in = new Scanner(System.in);
    boolean win = false;
    int startnum = 12;
    int pieces;
    int playermove;
    pieces = startnum;
    int winner = 0;
    while (pieces > 1){
      //player one
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println(oneName + ", enter your move: ");
      playermove = in.nextInt();
      if (!((playermove == 1) || (playermove == 2))){ //checks to see if number is within range or not some dumb answer
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces <= 1){
        System.out.println(oneName + " wins!");
        winner = 1;
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      
      
      //player two
      System.out.println(twoName + ", enter your move: ");
      playermove = in.nextInt();
      if (!((playermove == 1) || (playermove == 2))){ //checks to see if number is within range or not some dumb answer
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces <= 1){
        System.out.println(twoName + " wins!");
        winner = 2;
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      
      
    }
    if(winner == 1)
      return 1;
    else
      return 2;
    
  }
}
