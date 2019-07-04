package lab8;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

 

public class Exercise6 {
   
   public static void main(String[] args) throws ParseException {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Year");
       int year = sc.nextInt();
       System.out.println("Enter month");
       int month = sc.nextInt();
       System.out.println("Enter day");
       int day = sc.nextInt();
       
       
       LocalDate pdate = LocalDate.of(year, month, day);
    LocalDate now = LocalDate.now();
    
    Period diff = Period.between(pdate, now);
 System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                diff.getYears(), diff.getMonths(), diff.getDays()); 
   }
}