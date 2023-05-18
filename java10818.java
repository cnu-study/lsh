import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class java10818 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int N = k.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = k.nextInt();
        }
        Arrays.sort(array);
        System.out.print(array[0] +" ");
        System.out.print(array[N-1]);









    }
}
