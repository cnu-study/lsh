import java.util.Scanner;
public class java25304 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int X = k.nextInt();
        int N = k.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = k.nextInt();
            int b = k.nextInt();
            sum += a*b;

        }
        if (sum == X){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }







    }

}
