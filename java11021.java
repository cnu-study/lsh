import java.util.Scanner;
public class java11021 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int T = k.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = k.nextInt();
            int B = k.nextInt();

            System.out.printf("Case #%d: %d\n", i, A + B);
        }
    }
}