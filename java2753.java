import java.util.Scanner;
public class java2753 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int year = k.nextInt();
        ;
        if (year%4==0&& (year%400==0 || year%100!=0)) {
            System.out.print("1");
        }

        else {
            System.out.print("0");
        }
    }
}

