import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        int per;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        per= sc.nextInt();
        if(per<=100 && per>=90){
            System.out.println("You got A+");
        }
        else if(per<=90 && per>=80){
              System.out.println("You got A");
        }
        else if(per<=80 && per>=70){
              System.out.println("You got B");
        }
        else if(per<=70 && per>=60){
              System.out.println("You got C");
        }
        else if(per<=60 && per>=50){
              System.out.println("You got D");
        }
        else{
            System.out.println("You are fail");
        }

    }
    
}
