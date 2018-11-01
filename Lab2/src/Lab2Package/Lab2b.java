package Lab2Package;

//Conversion to Celcius
//Abraham Wade

public class Lab2b
{
	public static void main ( String [] args)
	{
		double D_E_S;
		int TF = 50;
		
		double TC = 5.0/9.0 *(TF - 32);
		D_E_S = 9.0/5.0 * TC + 32;
		
		System.out.println(D_E_S + "Fahrenheit");
		System.out.println(TC);
	}
}
