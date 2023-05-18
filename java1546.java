import java.util.Arrays;
import java.util.Scanner;

public class java1546 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        float []score = new float [num1];
        for (int i = 0; i < score.length ; i++) {
            score[i] = k.nextInt();
        }
        Arrays.sort(score);
        float cnt1 = 0;
        float A = 0;
        for (int i = 0; i < score.length; i++) {
            A = score[i]/score[num1-1]*100;
            cnt1+=A;
        }
        float ave = cnt1/num1;
        System.out.println(ave);




    }
}

