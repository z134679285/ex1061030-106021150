
import java.util.Scanner;

public class season {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if (m >= 1 && m <= 12) {
            if (m >= 3 && m <= 5) {
            System.out.println("Spring");
           } else if (m >= 6 && m <= 8) {
            System.out.println("Summer");
           } else if (m >= 9 && m <= 11) {
            System.out.println("Autumn");
            }else {
                System.out.println("Winter");
            }
        }
    }
}
