package lab1;

import java.util.Scanner;

public class Exercise31
{
	public static void main(String x[])
	{
	int n;
	boolean z;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	s.close();
	z=Exercise31.checkNumber(n);
	if(z)
		System.out.println("increasing number");
	else
		System.out.println("not a increasing num");

     }

	public static boolean checkNumber(int n)
	{
		int r=n%10;
		int s=n/10;
		int count = 0,i=0;
		 while(n!= 0)
		    {
		        count++;
		        n/= 10;
		    }
		 int y=count;
		 while(count!=0)
		 {
			 if(r>(s%10))
			 {
				 r=s%10;
				 s=s/10;
				 i++;
			 }
			count--; 
		 }
		if(y==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
