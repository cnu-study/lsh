import java.util.Scanner;

public class java2444 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int cnt =0;
        for (int i = 0; i < num1; i++) {
            for (int j = i; j < num1-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num1-1; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 2*i; j < 2*(num1-1)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
