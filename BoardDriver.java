import java.util.Scanner;


public class BoardDriver
{ 
 public static void main(String[] args)
 {
  Board mario = new Board();
  mario.createBoard();
  mario.drawBoard(10,3);
  boolean won = false;
  Player one = new Player();
  Player two = new Player();
  while (won == false)
  {
    System.out.println("It works");
    won = true;
  }
  System.out.println("Game Over");

 }

}
