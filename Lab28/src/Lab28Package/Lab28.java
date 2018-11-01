package Lab28Package;

//Final Lab
//Abraham S. Wade

import java.util.Scanner;
import java.util.Random;

public class Lab28
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random guess = new Random();
		int [] array = new int[100];
		
		System.out.print("Please Enter your name:");
		String name = scan.nextLine();
		System.out.println("Welcome " + name.toUpperCase());
		
		
		for(int arr = 0; arr<array.length; arr++)
		{
		  array[arr] = guess.nextInt(50) + 1;
		  System.out.println(array[arr]);
		}
	  
		double total = 0.0;
		for(int add = 0; add<array.length; add++)
		{
			 total += array[add];
			 
	}
		System.out.println(total);
	int even = 0;
	int odd = 0;

	for (int i = 0; i<array.length; i++)
	{
		if (array[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println("even " + even);
	System.out.println("odd " + odd);
	
	}
}