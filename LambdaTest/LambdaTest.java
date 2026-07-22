package LambdaTest;
interface Dance{
    void dance();
}
class Robot implements Dance{
    void dance(){
        System.out.println("dancing");
    }
}

public class LambdaTest {
    public static void main(String[] args) {
        Robot g1 = new Robot();
        g1.dance();
    }

}
