package Lab5Package;

//Pythagorean Theorem
//Abraham Wade

import java.util.Scanner;

public class Lab5
{
	public static void main ( String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length for side A :");
		double A = scan.nextDouble();
		double A2 = Math.pow(A,2);
		
		
		System.out.println("PLease enter the length for side B :");
		double B = scan.nextDouble();
		double B2 = Math.pow(B, 2);
		
		double c = Math.sqrt(A2 + B2);
		
		System.out.println("The hypothenusec is" + c);
			
		scan.close();		
	}
}