package Lab26Package;

//Multidimensional Array
// Abraham S. Wade

public class Lab26
{
	public static void main ( String [] args)
	{
		String [][] geo = {{"MD", "NY", "NJ", "MA", "ME", "CA", "MI", "OR",},
		                             {"Detriot", "Newark","Boston", "Seattle"}};
		System.out.println(geo[1][2]);
		System.out.println(geo[0][5]);
		
		for (int j = 0; j < geo[0].length; j++)
		{
			if (geo[0][j].charAt(0) == 'M')
				System.out.println(geo[0][j]);
		}
		
		for( int j = 0; j < geo[1].length; j++)
		{
			System.out.println(geo[1][j]);
		}
		for (int i = 0; i < geo.length; i++)
		{
			for (int j = 0; j < geo[i].length; j++)
			
				System.out.println(geo[i][j]);
				
			
			
		}
	}
}