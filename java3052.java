import java.util.Arrays;
import java.util.Scanner;


public class java3052 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] array =new int[10] ;
        for (int i = 0; i < 10; i++) {
            int num1 = k.nextInt();
            array[i]= num1%42;
        }
        int str =0;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if (array[i]==array[j]) {
                    str += 1;
                    break;

                }

            }
        }
        System.out.println(10-str);
    }
}

