package Lab20Package;


import java.util.Scanner;

public class Lab20c
{
	public static void main( String[]args)
	{
		Scanner scan = new Scanner(System.in);

		String[] names = new String[10];

		System.out.println("Array size is " + names.length);

		for (int name = 0; name < names.length; name++)
		{
		System.out.print("Enter number at position "+(name+1)+": ");
		names[name] = scan.nextLine();
		}

		System.out.println("The values in reverse:");

		for (int name = names.length-1; name >= 0; name--)
		System.out.println(names[name].toUpperCase());

		scan.close();
	}
}