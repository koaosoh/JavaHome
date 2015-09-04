package DayTwo;

import java.util.Scanner;

public class CentstoDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sucker;
		int euros;
		int crowns;
		Scanner inputsucker = new Scanner(System.in);
		System.out.println("Input cents you Sucker:");
		sucker = inputsucker.nextInt();
		euros = sucker/100;
		crowns = sucker%100;
		System.out.println("That is: " + euros + " euros and " + crowns + " cents.");
	

	}

}
