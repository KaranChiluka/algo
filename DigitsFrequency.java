import java.util.*;
class DigitsFrequency
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int f = getDigit(n,d);
		System.out.println(f);
	}
	public static int getDigit(int n, int d)
	{
		int count = 0;
		
		while(n>0)
		{
			int dig = n % 10;
			n = n / 10;
			
			if(dig == d)
			{
				count++;
			}
		}
		
		return count;
	}
}