import java.util.*;
import java.util.Scanner;

public class TicTacToe
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to tictactoe game");
  createBoard();
  chooseLetter();
 }
 public static void createBoard()
 {
  char board[] = new char[10];
  for(int i=0; i<10; i++)
  {
   board[0]=' ';
  }
 }
 public static void chooseLetter()
 {
  System.out.println("enter your choice. Press 1 for X or Press 2 for O");
  Scanner a=new Scanner(System.in);
  int chosenLetter = a.nextInt();
  if(chosenLetter==1)
  {
   System.out.println("you have chosen X");
  }
  else
  {
  System.out.println("you have chosen O");
  }
 }
}
