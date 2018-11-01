package Lab24Package;

//Sorting
//Abraham S. Wade

public class Lab24
{
	
public static void main(String[] args)
{
	int [] numArray = {27, 30, 15, 73, 9, 11, 41, 62, 57, 3};
	
print(numArray); sort(numArray); print(numArray); 

}

public static void print(int [] n)
{ 
	for (int i = 0; i < n.length; i++)
		System.out.print (n[i] + " "); 
	
	System.out.println(); 
	}
/*public static void sort(int[] n)
{
	int temp;
	for(int sort = 0; sort<n.length-1; sort++)
	{
	 for (int pass = 0; pass<n.length-sort-1; pass++)
	 {
		 if(n[pass] > n[pass + 1])
		 {
			 temp = n[pass];
			 n[pass] = n[pass + 1];
			 n[pass + 1] = temp;
		 }
	 }
	 
	}
	
}*/
public static void sort(int[] n)

{
	int iterates = 0;
	int comps = 0;
	int swaps = 0;
	
	int max, temp;
	for (int i = n.length-1; i > 0; i--)
{
	 
		max = 0;
	for (int j = 1; j <= i; j++)
	{
		
		if (n[j] > n[max])
			max = j;
		swaps++;
		System.out.println(swaps);
	}
	
	temp = n[max];
	n[max] = n[i];
	n[i] = temp;
	iterates++;
	comps++;
	}
	System.out.println(comps);
	System.out.println(iterates);

	}


}