package lab13;
interface Verify{
    String normal(String str);
}
public class Exercise4 {
    private String name;
    public static String basic(String str) {
        return str;
     }
public static void main(String args[]) {
    Exercise4 obj = new Exercise4();
    obj.setName("siri");
    Verify validate = Exercise4 :: basic;
    System.out.println(validate.normal(obj.getName()));
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
}