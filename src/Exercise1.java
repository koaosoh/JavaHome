
public class Exercise1	 {

	public static void main(String[] args) {
		
	//Exercise 1 Payroll Program
		
		long hoursWorked=40;
		double payRate=10.0, taxRate=10.0;
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("pay Amount: " +  hoursWorked + " " + payRate);
		System.out.println("tax Amount: " + hoursWorked + " " + payRate + " " + taxRate);
			//placed whitespace to declare separately  
		short giraffeMilk=29;
		double lionMilk=30.3;
		double tigerBalm= 47.999;
		System.out.println("Giraffes milked: " + giraffeMilk);
		System.out.println("Big Cat Juice: " +  (lionMilk * tigerBalm));
		System.out.println("Jungle Juice: " + lionMilk * giraffeMilk * tigerBalm);
		 	//When lionMilk declaration is removed, lionMilk cannot be resolved to a variable
				//When one of the initializations are removed, the programs detects it upon deletion
		
	//Exercise 2 Value of a Quadradic
		/*double x = 547.4444;
		double result = ((3.0*Math.pow(x, 2))-(8*x)+4);
		System.out.println("At X = " + x + ", the value is " + (result));*/
			//When inputing x=2/3, the value doesn't evaluate to 0
		
	//Exercise 3 Reassigning values to Variables	
		double [] x = {0, 2, 4};
		
		for(int num = 0; num < 3; num++){	
			double result = ((3.0*Math.pow(x[num], 2))-(8*x[num])+4);
			System.out.println("At X = " + x[num] + ", the value is " + result);
		}
		//Elegant code "flubbadub dub"-Rick, from Rick&Morty
		
		/*double x = 0;
			
			double result = ((3.0*Math.pow(x, 2))-(8*x)+4);
			System.out.println("At X = " + x + ", the value is " + result);
			
			x = 2.0;
			
			result = ((3.0*Math.pow(x, 2))-(8*x)+4);
			System.out.println("At X = " + x + ", the value is " + result);
			
			x = 4.0; 
			
			result = ((3.0*Math.pow(x, 2))-(8*x)+4);
			System.out.println("At X = " + x + ", the value is " + result);*/
				
			
		
	}

}
