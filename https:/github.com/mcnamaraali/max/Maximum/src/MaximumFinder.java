
import java.util.Scanner; //Part of the Java API - enables software reuse - reusability is part of 
//the main software engineering principles and to always be kept in mind. 

public class MaximumFinder {

	public static void main(String[] args) {
		
		//Create a Scanner input from the command window
		Scanner input = new Scanner(System.in);
		//this is similar as previous videos - I have called this input, please use a word
		//useful for your own program
		System.out.print("Enter three floating point values separated by spaces: ");
	
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		System.out.println("Maximum number is: " + result);
	}
	
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		
		if(y > maximumValue) {
			maximumValue = y;
		}
		if(z > maximumValue) {
			maximumValue = z;
		}
		return maximumValue;
	}

}
