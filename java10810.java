import java.util.Arrays;
import java.util.Scanner;

public class java10810 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N= k.nextInt();
        int M = k.nextInt();
        int[]basket = new int[N];

        for (int i = 0; i < M; i++) {
            int I = k.nextInt();
            int J = k.nextInt();
            int K = k.nextInt();
            for (int j = I-1; j <= J-1; j++) {
                basket[j]=K;

            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i]+ " ");

        }
    }
}

