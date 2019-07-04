package lab13;
import java.util.function.Function;
public class Exercise2 {
    public static void main(String args[]) {
        Function<String,String> s=(str)->{
            String s1="";
            String s2[] = str.split("");
            for(String ch:s2)
                s1 = s1+ " "+ch;
            return s1;
        };
        System.out.println(s.apply("srilekha"));
        
    }
}