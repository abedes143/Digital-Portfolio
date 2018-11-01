package Lab20Package;


import java.util.Scanner;
public class Lab20
{
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);

double[] numbers = new double[6];

System.out.println("Array size is " + numbers.length);

for (int index = 0; index < numbers.length; index++)
{
System.out.print("Enter number at position "+(index+1)+": ");
numbers[index] = scan.nextDouble();
}

System.out.println("The values in reverse:");

for (int index = numbers.length-1; index >= 0; index--)
System.out.println(numbers[index]);

scan.close();
}
}