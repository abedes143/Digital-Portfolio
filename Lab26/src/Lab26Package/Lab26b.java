package Lab26Package;

//Abraham S. Wade

public class Lab26b
{
	public static void main (String [] args)
	{
		int [][] a = { {9, 6, 8, 10, 5},
				{7, 6, 8, 9, 6},
				{4, 8, 10, 6, 6}};
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			
		}
		System.out.println("sum is " + sum);
		
		int count = 0;
		for ( int i = 0; i < a.length; i++)
		{
			for (int j = 0; j<a[i].length; j++)
				{
				if (a[i][j]== 8)
				count++;
				}
			System.out.println(count);
		}
		 
		int ct = 0;
		for ( int j = 0; j < a[1].length; j++)
		{
			if (a[1][j] == 6)
				ct++;
		}
		System.out.println(ct);
		
		int sums = 0;
		for(int i = 0; i<a.length; i++)
		{
			 for(int j = 0; j<a[i].length; j++)
			 {
				
			 }
		}
		System.out.println(sums);
	}
	
}