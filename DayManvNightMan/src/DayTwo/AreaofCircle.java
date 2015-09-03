package DayTwo;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Radius;
		Scanner inputRadius = new Scanner(System.in);
		System.out.println("Input Radius");
		Radius = inputRadius.nextInt();
		System.out.println("The radius is: " + Radius + ". The area is: " + Math.PI * Math.pow(Radius,  2));
		
	

	}

}
