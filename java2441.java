import java.util.Scanner;

public class java2441 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = num1; j >i ; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
