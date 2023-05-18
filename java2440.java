import java.util.Scanner;

public class java2440 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N-i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }




    }


}
