package lab8;
import java.util.Scanner;
public class Exercise7 {
public static void main(String[] args)
    {
Scanner s=new Scanner(System.in);
String s1=s.next();
s.close();
String s2=s1.substring(0, s1.length()-4);
if(s1.substring(8, s1.length()).equals("_job")&&s2.length()==8)
{
    System.out.print("true");
}
else
{
    System.out.print("false");
}
}
}