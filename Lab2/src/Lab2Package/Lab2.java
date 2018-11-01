package Lab2Package;

//This is Converting Inches to Centimeter
//Abraham Wade

public class Lab2
{
	public static void main ( String [] args)
	{
		
		double CM_PER_INCH= 2.54;
		double inches= 1;
		
		double centimeters= inches * CM_PER_INCH;
		
		System.out.println(inches+ " inches are equivalent to Centimeter " + centimeters);
	}
}