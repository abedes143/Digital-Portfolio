package Lab20Package;

public class Lab20b
{
public static void main(String [] args)
{
final int MAX = 15; 
final int MULT = 5; 

int [] list = new int[MAX];

for (int index = 0; index < MAX; index++)
list[index] = index * MULT;

list[8] = 999;

for (int space = 0; space < MAX; space++)
System.out.print(list[space] + " ");
System.out.println();
}
}