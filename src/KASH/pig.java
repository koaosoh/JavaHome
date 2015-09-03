package KASH;

import java.util.Scanner;
import java.util.Random;

public class pig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int playaScore = 0;
	      int playaTotal = 0;
	      int computerScore = 0;
	      int subtotal = 0;
	      int playaRoll, computerRoll;
	      final Scanner keyboard = new Scanner(System.in);
	      final Random rand = new Random();
	      char choice = 'h';
	      String input;
	      System.out.println("Welcome to Hell, PIG!\n");
	 
	 
	      while (computerScore < 100 && playaScore < 100)
	      {
	         do
	         {
	            playaRoll = rand.nextInt(6) + 1;
	            System.out.println("You rolled: " + playaRoll);
	            if (playaRoll == 1)
	            {
	               playaScore = 0;
	               System.out.print("You lose your turn! ");
	               System.out.print("Your total is " + playaTotal);
	            }
	            else
	            {
	               playaScore += playaRoll;
	               System.out.print("Your turn score is " + 
	                                playaScore);
	               System.out.println(" If you hold you will have " +
	                                  playaScore + " points.");
	               System.out.println("Enter 'r' to roll " +
	                                  "again, 'h' to hold.");
	               input = keyboard.nextLine();
	               choice = input.charAt(0);
	                
	               if (choice == 'h')
	               {
	                 playaScore += playaRoll;
	               }
	            }
	         }while (playaRoll != 1 && choice != 'h');
	          
	         do
	         {
	            computerRoll = rand.nextInt(6) + 1;
	            System.out.println("The computer rolled: " +
	                               computerRoll);
	            //if (computerRoll != 1)
	            if (computerRoll == 1)
	            {
	               computerScore = 0;
	               System.out.print("The computer lost its turn!");
	               System.out.println(" Computer total is " +
	                                  subtotal);
	            }
	            else
	            {  
	               computerScore += computerRoll;
	                  computerRoll += subtotal;
	            }
	          
	          }while (computerRoll != 1 && subtotal <=20);
	      }
	      while (playaTotal >= 100)
	      {
	         System.out.println("YOU WIN!");
	      }
	      while (subtotal >= 100)
	      {
	         System.out.println("THE COMPUTER WINS!");
	      }   
	   }
}
	         