package TajProject;

//Abraham S. Wade

import java.util.Scanner; //I imported Scanner
import java.text.DecimalFormat;  // I imported Decimal Format
import java.io.File;   // I imported File

public class Try
{
	public static void main ( String [] args) throws Exception  // I throw an Exception
	{
		
		Scanner file = new Scanner( new File("bouncedata.txt"));    //I use Scanner to import The file.
		DecimalFormat pricePattern = new DecimalFormat("0.00");    //i set the Decimal Format I imported to two decimal places.
		
		
		
		while (file.hasNextDouble())  // I started a nested loop and I told the compiler to read the file in this first while loop.
		{
			double initial = file.nextDouble();  // I instantiated the initial drop and told the compiler to read it from the file.
			double up =  file.nextDouble();      //I instantiated up as the first bounce and told the compiler to read it from the file.
		    int maxbounce = file.nextInt();      // I instantiated the maxbounce and told the compiler to read it from the file.
		    int bounce = 1;  // I instantiated bounce to compare it to maxbounce so the compiler don't go over the actual bounce.
		    double index = up / initial;  // I set up the index  by dividing the first bounce by the initial drop.
			double distance = initial + up;  // the distance will always be set to the initial plus up.
			double total = distance;   // Whatever the distance is i set it as the total.
			System.out.println("Initial Drop Height " + pricePattern.format(initial) + "ft"); // I told the computer to print out the initial height and format i
			System.out.println("First Bounce " +  pricePattern.format(up) + "ft");
			System.out.println("Index " +  pricePattern.format(index));
			
		    while (distance > 0.001  && bounce < maxbounce)
		    {
		    	bounce+=1;
		    	double down = up;
			    up = down * index;
			    distance = down + up;
			    total += distance;
			}
		    System.out.println(bounce);
		    System.out.println("Total " +  pricePattern.format(total) + "ft\n");
		}
	
		
	}
}