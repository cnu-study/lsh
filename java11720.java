import java.util.Scanner;

public class java11720 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        String a = k.next();
        int cnt  =0;
        for (int i = 0; i < num1; i++) {
            cnt+=a.charAt(i)-'0';
        }
        System.out.println(cnt);

    }
}
