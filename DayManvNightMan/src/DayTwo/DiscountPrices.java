package DayTwo;

import java.util.Scanner;

public class DiscountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int User;
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Purchase Amount: ");
		User = inputUser.nextInt();
		if(User>1000)
			{int d;
			 int f;
			 d = User/10;
			 f = User - d;
		System.out.println("Discounted Price: " + f);}
		
		else
			System.out.println("Please Pay: " + User);}
		
			 
		
		

	}
