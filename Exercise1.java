package lab13;

import java.util.Scanner;

interface  Power
{
    public int cal(int x,int y);
}
public class Exercise1 {
	public static void main(String[] args)
    {
		
    Power p=(x,y)->{
        int res=1;
        for(int i=1;i<=y;i++)
        res=res*x;
        return res;
    };
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    s.close();
    int res=p.cal(n,k);
    System.out.println(res);
    }
} 








				