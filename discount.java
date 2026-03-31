import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        int age,tbill;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        Scanner sc2= new Scanner(System.in);
        System.out.print("Enter your total bill: ");
        tbill = sc.nextInt();
        if(age>60 || tbill>100){
            System.out.println("Eligible for discount");
        }
        else{
            System.out.println("Not eligible for discount");
        }
    }
    
}
