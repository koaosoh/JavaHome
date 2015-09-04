package DayTwo;

import java.util.Scanner;		

public class OrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b;
		int n;
		int w;
		
		Scanner inputb = new Scanner(System.in);
			System.out.println("Number of Bolts: ");
			b = inputb.nextInt();
			
			Scanner inputn = new Scanner(System.in);
			System.out.println("Number of Nuts: ");
			n = inputn.nextInt();
			
			Scanner inputw = new Scanner(System.in);
			System.out.println("Number of Washers: ");
			w = inputw.nextInt();
			
			if(b>n)
			{System.out.println("Check the order:too few nuts. ");
			}
			if(w<(2*b))
			{System.out.println("Check the order:too few washers. ");
			}
			if(b<=n && w>=(2*b))
			{System.out.println("Order is OK.");
				System.out.println("\nTotal cost: " + (b*5)*(n*3)*(w*1));}
			}
			
			
		
		
		
		
		
		
	}

