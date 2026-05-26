class Helper{
    static int Multiply(int a, int b){
        return a * b;
    }

    static double Multiply(double a, double b){
        return a * b;
    }
}
public class multi {
    public static void main(String[] args) {
        int intResult = Helper.Multiply(3, 4);
        double doubleResult = Helper.Multiply(2.5, 3.5);

        System.out.println("Multiplication of integers: " + intResult);
        System.out.println("Multiplication of doubles: " + doubleResult);
    }
}