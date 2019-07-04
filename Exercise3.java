package lab13;
import java.util.Scanner;
@FunctionalInterface
interface Validation{
    public boolean validate(String str1,String str2);
}
public class Exercise3 {
    public static void main(String args[]) {
        Validation val = (str1,str2)->{
            if((str1.equals("srilekha"))&&(str2.equals("siri@123"))) {
                return true;
            }
            else
                return false;
        };
        System.out.println("Enter user name ");
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        System.out.println("Enter Password ");
        String s2 = sc.next();
        System.out.println(val.validate(s1,s2));
        sc.close();
    }
}
 