import java.util.Scanner;


public class BoardDriverMain
{ 
  public static void main(String[] args)
  {
    Board mario = new Board();
    mario.createBoard();
    mario.drawBoard(3,10);
    boolean won = false;
    Player one = new Player();
    Player two = new Player(); //too much work to implement a dice roll for which player goes first
    mario.continueKey();
    while (won == false)
    {
      System.out.println("It works");
      won = true;
    }
    System.out.println("Game Over");
    
  }
  

  
}
