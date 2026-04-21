public class pyq{
    public static void main(String[]agrs){
        int i,j,space;
        space = 3;
        for(i=1;i<=4;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }    
    }
}