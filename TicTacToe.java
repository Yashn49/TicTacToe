import java.util.*;
import java.util.Scanner;


public class TicTacToe
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to tictactoe game");
  createBoard();
 }
 public static void createBoard()
 {
  char board[] = new char[10];
  for(int i=0; i<10; i++)
  {
   board[0]=' ';
  }
 }
}
