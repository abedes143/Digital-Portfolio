package Lab23Package;

//bubble sort
//Abraham S. Wade

import java.util.Scanner;

public class Lab23
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String [] contacts = new String[20];
		
		contacts[0] = "Jean";
		contacts[1] = "Scott";
		contacts[2] = "Warren";
		contacts[3] = "Charles";
		contacts[4] = "Kurt";
		contacts[5] = "Hank";
		contacts[6] = "Bobby";
		contacts[7] = "Kitty";
		contacts[8] = "Ororo";
		contacts[9] = "Emma";
		contacts[10] = "James";
		contacts[11] = "Peter";
		contacts[12] = "Wade";
		contacts[13] = "Betsy";
		contacts[14] = "Remy";
		contacts[15] = "N/A";
		contacts[16] = "N/A";
		contacts[17] = "N/A";
		contacts[18] = "N/A";
		contacts[19] = "N/A";
		
		for(int names = 0; names<contacts.length; names++)
		{
			System.out.println(contacts[names]);
		}
		String contact15 = scan.nextLine();
		contacts[15] = contact15;
		String contact16 = scan.nextLine();
		contacts[16] = contact16;
		String contact17 = scan.nextLine();
		contacts[17] = contact17;
		String contact18 = scan.nextLine();
		contacts[18] = contact18;
		String contact19 = scan.nextLine();
		contacts[19] = contact19;
	for( int names = 0; names<contacts.length; names++)
	{
		System.out.println(contacts[names]);
	}
		bubblesort(contacts);
	
		for( int names = 0; names<contacts.length; names++)
		{
			System.out.println(contacts[names]);
		}	
		
	}
	public static void bubblesort(String c [])
	{
		String temp;
		for ( int i = 0; i < c.length-1; i++)
		{
			for( int j = 0; j < c.length-i-1; j++)
			{
				if (c[j].compareTo(c[j+1])>0)
				{
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
	
	
	}
} 