import java.util.Arrays;
import java.util.Scanner;


public class java10813 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N= k.nextInt();
        int M = k.nextInt();
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i]=i+1;
        }
        for (int i = 0; i < M; i++) {
            int I = k.nextInt();
            int J = k.nextInt();
            int temp = basket[I-1];
            basket[I-1] = basket[J-1];
            basket[J-1]= temp;

        }
        for (int i = 0; i <N ; i++) {
            System.out.print(basket[i]+" ");

        }


    }
}

