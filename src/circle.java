import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        int Y = scn.nextInt();
        if (X<=100 && X>=-100 && Y<=100 && Y>=-100){
            System.out.println("inside");
        }else {
            System.out.println("outside");
        }
    }
}
