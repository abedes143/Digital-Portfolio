package Lab22Package;

//Linear Search
//Abraham S. Wade

import java.util.Scanner;

public class Lab22
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String [] English = new String[10];
		String [] Spanish = new String [10];
	 
		English[0] = "Dog";
		English[1] = "Cat";
		English[2] = "Banana";
		English[3] = "Car";
		English[4] = "Firefighter";
		English[5] = "Cheese";
		English[6] = "Door";
		English[7] = "Chair";
		English[8] = "Question";
		English[9] = "Scary Clown";
		
		Spanish[0] = "El Perro";
		Spanish[1] = "El Gato";
		Spanish[2] = "El Platano";
		Spanish[3] = "El Coche";
		Spanish[4] = "El Bomber";
		Spanish[5] = "El Queso";
		Spanish[6] = "La Puerta";
		Spanish[7] = "La Silla";
		Spanish[8] = "La Pregunta";
		Spanish[9] = "El Payaso Asustado";
	
		
		System.out.println("Please enter an English word:");
		String user = scan.nextLine();
		
		int location = linearSearch(English, user);
		
		if (location !=-1)
			System.out.println("The spanish word is: " + Spanish[location].toLowerCase());
		else
			System.out.println("word is not available");
	}
	public static int linearSearch(String s[], String key)
	{
		boolean found = false;
		int index = 0;
		 int word = -1;
		while (!(found) && (index<s.length))
		{
			if (s[index].equals(key))
			{
				found = true;
				word = index;
			}
			index++;
		}
		return word;
	}
 
}