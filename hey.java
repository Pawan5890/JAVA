import java.util.Scanner;
public class hey {
    public static void main(String[]args){
        int size;
        
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your choice form 1,2,3,4: ");
    size = sc.nextInt();
        switch (size){
            case 1:
                System.out.println("You choice is 1");
                break;
            case 2:
                System.out.println("You choice is 2");
                break;
            case 3:
                System.out.println("You choice is 3");
                break;
            case 4:
                System.out.println("You choice is 4");
                break;

            default:
                System.out.println("Invalid Choice");
        }
        
    }
}
