import java.util.Scanner;

public class java2562 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[]A = new int[9];
        int max = A[0];
        int num1=0;
        for (int i = 0; i < 9; i++) {
            A[i] = k.nextInt();
            if(A[i]>max) {
                max = A[i];
                num1=i+1;
            }

        }
        System.out.println(max);
        System.out.println(num1);




    }
}