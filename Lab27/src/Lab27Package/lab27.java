package Lab27Package;

//recursion
//Abraham S. Wade

public class lab27
{
	public static void main(String [] args)
	{
		System.out.println(123450 + 60378 + gcd(123450, 60378));
	}
	
	public static int gcd(int dividend, int divisor)
	{
		System.out.print(dividend + divisor);
		System.out.println(dividend + divisor + (dividend % divisor));
		
		if(dividend % divisor ==0)
		{
			System.out.println(divisor);
			return divisor;
		}
		else
		{
			int temp = gcd(divisor, dividend % divisor);
			System.out.println(divisor + (dividend % divisor + temp));
			return (temp);
		}
	}
}