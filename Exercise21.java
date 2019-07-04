package lab1;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String x[])
	{
		int n,x1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		Exercise21 a=new Exercise21();
		x1=a.calculateDifference(n);
		System.out.println(x1);
	}
public int calculateDifference(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
		sum=sum+(i*i);
	int b=0;
	for(int i=1;i<=n;i++)
    b+=i;
	return sum-(b*b);
}
}
