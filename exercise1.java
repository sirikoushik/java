package lab1;
import java.util.*;
public class exercise1 
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.close();
		exercise1 a1=new exercise1();
	 n= a1.calculatesum(n);
		System.out.println(n);
		
	}
public int calculatesum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%3==0||i%5==0)
		sum=sum+i;
	}
	return sum;
}
}