package Lab21Package;

import java.util.Scanner;

public class Lab21
{
	public static void main( String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String [] trains = new String[5];
		String [] origin = new String[5];
		String [] destination = new String[5];
		String [] time = new String[5];
		
		System.out.println("Array size is " + trains.length);
		
		trains[0] = "B30";
		trains[1] = "G21";
		trains[2] = "R32";
		trains[3] = "Z53";
		trains[4] = "M84";
	 
		origin[0] = "Bensonhurt";
		origin[1]= "Red Hook";
	 	origin[2]= "Brighton Beach";
	 	origin[3] = "Rockaway Park";
	 	origin[4] = "Sheepshead Bay";
	 
	 	destination[0] = "Flushing";
	 	destination[1] = "Flatbush";
	 	destination[2] = "Bushwick";
	 	destination[3] = "Jackson Heights";
	 	destination[4] = "Forest Hills";
	 
	 	time[0] = "8:45";
	 	time[1] = "10:15";
	 	time[2] = "1:35";
	 	time[3] = "2:40";
	 	time[4] = "4:20";
		
	
	 }
	}
}