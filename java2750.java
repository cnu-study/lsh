import java.util.Arrays;
import java.util.Scanner;

public class java2750 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int num1 = k.nextInt();
            arr[i] = num1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
