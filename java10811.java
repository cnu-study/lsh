import java.util.Arrays;
import java.util.Scanner;


public class java10811 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        int M = k.nextInt();
        int[] basket= new int[N];
        for (int i = 0; i <N; i++) {
            basket[i]=i+1;
        }
        for (int i = 0; i < M; i++) {
            int I = k.nextInt();
            int J = k.nextInt();
            if ((J-I+1)%2==0){
                for (int j = 0; j < ((J-I+1)/2); j++) { //몇번 change할 것인지
                    int temp = basket[I + j - 1];
                    basket[I + j - 1] = basket[J - j - 1];
                    basket[J - j - 1] = temp;
                }
            }
            else{
                for (int j = 0; j < ((J-I)/2); j++) {
                    int temp = basket[I + j - 1];
                    basket[I + j - 1] = basket[J - j - 1];
                    basket[J - j - 1] = temp;

                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i]+ " ");
        }

    }
}

