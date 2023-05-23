import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class java2577 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int A = k.nextInt();
        int B = k.nextInt();
        int C = k.nextInt();

        int mul = A*B*C;
        int[] arr = new int[10];
        String str = Integer.toString(mul);
        for (int i = 0; i < str.length(); i++) {
            arr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
