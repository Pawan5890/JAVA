public class GenericFunction {
    static <T> void print(T s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        print("Hello, World!");
        print(42);
        print(new int[]{1, 2, 3});
    }
}
