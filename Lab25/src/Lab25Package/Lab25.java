package Lab25Package;

//Binary Search
//Abraham S. Wade

import java.util.Random; 
import java.util.Scanner;

public class Lab25
{
public static void main(String [] args) 
{ 
	Random pick = new Random(); 
	Scanner scan = new Scanner(System.in); 
	
	int [] numbers = new int[50]; 
	
	for(int i = 0; i < numbers.length; i++)
		numbers[i] = pick.nextInt(100) + 1; 
	     
	     display(numbers); 
	     sort(numbers); 
	     display(numbers); 
	     
	System.out.println("Enter a value to find: "); 
	
	int what = scan.nextInt(); 
	int where = search(numbers, what);

      if (where == -1) 
    	  System.out.println("Value is not in the array"); 
      
      else System.out.println("Value is in location "+ where);
    } 

 public static void sort(int a[])
 { 
  int temp;
   
   for(int i = 0; i < a.length-1; i++)
   {
	   for (int j = 0; j < a.length-i-1; j++)
	   {
		   if (a[j] > a[j + 1])
		   {
			   temp = a[j];
			   a[j] = a[j + 1];
			   a [j + 1] = temp;
			   
		   }
	   }
   }
   
   
   
 }
 
 public static int search(int a[], int key) 
 { 
	 int start = 0, end = a.length -1, mid, spot = -1;
	 boolean found = false;
	 
	 while((end >= start) && !(found))
	 {
		 mid = (start + end) / 2;
		 System.out.println(mid);
		 if (a[mid] == key)
		 {
			 found = true;
			 spot = mid;
		 }
		 
		 else if (a[mid] > key)
			 end = mid -1;
		 else
			 start = mid + 1;
	 }
	 return spot;
  } 
 public static void display(int a[]) 
 { 
	 for(int i = 0; i < a.length; i++) 
		 System.out.print(a[i] + " "); 
	 System.out.println();
	 } 
 }
 
 

 
 
 
 
 
 
 
 
 
 