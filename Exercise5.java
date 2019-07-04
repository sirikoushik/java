package lab13;
import java.util.function.Function;
public  class Exercise5 
{
    public static void main(String[] args)
{
        Exercise5  fs=new Exercise5 ();
         Function<Integer,Long>f=fs::fact;
         long res=f.apply(11);
         System.out.println(res);
}
    public  long fact(int x)
    {
     long factres=1;
     for(int i=1;i<=x;i++)
     {
         factres=factres*i;
     }
     return factres;
}
}
 









