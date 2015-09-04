/*
 * This is a legend for my code 
 * How  do you like this bad boy 
 */

package DayTwo;

import java.util.Scanner;		

public class OrderChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b; //bolt
		int n; //nut
		int w; //washer
		String choice = ""; 
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("Number of Bolts: ");
			b = input.nextInt();
			
			System.out.println("Number of Nuts: ");
			n = input.nextInt();
			
			System.out.println("Number of Washers: ");
			w = input.nextInt();
			
			if( !(b<=n) && !(w>=(2*b) ) ) {
				System.out.println("Would you like to change your order?");
				choice = input.nextLine();   
			}
			
			if(b>n)
				System.out.println("Check the order:too few nuts. ");

			if(w<(2*b))
				System.out.println("Check the order:too few washers. ");

			if(b<=n && w>=(2*b)){
				System.out.println("Order is OK.");
				System.out.println("\nTotal cost: " + (b*5)*(n*3)*(w*1));
			}

//			else if ( !(b<=n) && !(w>=(2*b) ) ) {
				

//			}
			
		}while( choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("ok") ); 
			
	}
		
		
		
		
		
		
}
