import java.util.Arrays;
import java.util.Scanner;


public class java3003 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] chess = new int [6];
        for (int i = 0; i < 6; i++) {
            chess[i]= k.nextInt();
        }
        System.out.print(1-chess[0]+" ");
        System.out.print(1-chess[1]+" ");
        System.out.print(2-chess[2]+" ");
        System.out.print(2-chess[3]+" ");
        System.out.print(2-chess[4]+" ");
        System.out.print(8-chess[5]+" ");
    }
}

