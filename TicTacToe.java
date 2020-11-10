import java.util.*;
import java.util.Scanner;

public class TicTacToe
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to tictactoe game");
  createBoard();
  chooseLetter();
  showBoard();
 }
//uc1
 public static void createBoard()
 {
  char board[] = new char[10];
  for(int i=0; i<10; i++)
  {
   board[0]=' ';
  }
 }
//uc2
 public static void chooseLetter()
 {
  System.out.println("enter your choice. Press 1 for X or Press 2 for O");
  Scanner a=new Scanner(System.in);
  int chosenLetter = a.nextInt();
  if(chosenLetter == 1)
  {
   System.out.println("you have chosen X");
  }
  else
  {
   System.out.println("you have chosen O");
  }
 }
//uc3
 public static void showBoard()
 {
  System.out.println("/-----|-----|---\\");
  System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
  System.out.println("/-----|-----|---\\");
  System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
  System.out.println("/----|-----|----\\");
  System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
  System.out.println("/------|----|---\\");
 }
}



















