package System.out;
import java.util.Scanner; 

public class println {
	double x=0;
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);	
		System.out.println("Please enter a valie for x ");
		x=input.nextLine();
	
		double quad=0;
		double x=0;
		quad= 3*x*x-8*x+4;
		System.out.println("At X= "+x+"the value is "+quad);

	}

}
