public class rev {
    public static void main(String[] args) {
        int i, j, space;
        space = 0;

        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}