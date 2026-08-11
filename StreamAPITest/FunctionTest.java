import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // Function<Integer,Integer> sqr = num -> num*num;
        // System.out.println(sqr.apply(5));
        // Function<Integer,Boolean> isZero = num -> num==0;
        // System.out.println(isZero.apply(0));
        Function<Integer,Integer> tax = sal -> sal + 10000;
        //System.out.println(tax.apply(100000));
        Function<Integer,Integer> tax1 = sal -> sal + 5000;
        //System.out.println(tax1.apply(100000));
        System.out.println(tax.andThen(tax1).apply(100000));


    }
    
}
