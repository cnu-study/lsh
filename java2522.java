import java.util.Scanner;

public class java2522 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        for (int i = 0; i < num1; i++) {
            for (int j = num1-1; j >i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num1-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = num1-1; j >i ; j--) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}

