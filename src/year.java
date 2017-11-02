import java.util.Scanner;

public class year {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
//        if (y % 4 == 0) {
//            System.out.println("Bissextile Year");
//        } else if (y % 100 == 0) {
//            System.out.println("Common Year");
//        } else if (y % 400 == 0) {
//            System.out.println("Bissextile Year");
//        } else {
//            System.out.println("Common Year");
//        }
//    }
//}
//}這樣打會判斷錯誤輸入100會優先從上面判斷下來
            if (y%400==0){
            System.out.println("Bissextile year");
        }else if (y%100==0){
            System.out.println("Common year");
        }else if (y%4==0){
            System.out.println("Bissextile year");
        }else{
            System.out.println("Common year");
        }
    }
}