import java.util.function.Supplier;

public class Supplier {
    public static void main(String[] args) {
        Supplier<Double> random = () -> (int) (Math.random() * 100);
        System.out.println(random.get());
    }
}
