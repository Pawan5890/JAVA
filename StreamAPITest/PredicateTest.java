
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p1 = num -> num % 2 == 0;
        //System.out.println(p1.test(20));
        Predicate<String> isPresent = name -> name.contains("a");
        //System.out.println(isPresent.test("a"));
        Predicate<String> isValid = mail -> mail.contains("@");
        //System.out.println(isValid.test("123@123.com"));
        Predicate<String> isValid1 = mail -> mail.contains("@") && mail.contains(".");
        //System.out.println(isValid1.test("123@123.com"));
        System.out.println(isValid1.test("123@123com")&& isValid1.test("123.com"));
        Predicate
    }
    
}
