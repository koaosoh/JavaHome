package KASH;

import java.util.Scanner;

public class Guesswho {

	public static void main(String[] args) {
	Scanner newscanner= new Scanner(System.in);
	boolean check=false;
	int number,counter=0;
	int rng=(int) (Math.random()*10+1);
			System.out.println(rng);
	while(check==false)
			{
		if(counter>2)
			{
			System.out.println("You're wrong, LOSER!");
	break;
		
			}
			System.out.println("A number from 1-10 NOW");
			number=newscanner.nextInt();
		
		if(number==rng)
			{System.out.println("Ok, Ok, you can keep your retirment funds...");
			check=true;
				
			}
		else if((number+1==rng)||(number-1==rng))
			{System.out.println("HOT");
			
			}
		else if ((number+2==rng)||(number-2==rng))
			{
			System.out.println("Warm");
			
			}
		
		else
			{
			System.out.println("Cold");
		
			}
			counter++;
		
	
	}
}
}