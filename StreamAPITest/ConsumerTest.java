import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<Integer> c1 = num -> System.out.println(num);
        c1.accept(10);

    }
        
    
}
