import java.util.Scanner;

public class java10886 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int cnt1=0;
        int cnt2 = 0;
        for (int i = 0; i < num1; i++) {
            if (k.nextInt()==1) cnt1++; //귀엽
            else cnt2++;

        }
        if (cnt1>cnt2) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");


    }
}
