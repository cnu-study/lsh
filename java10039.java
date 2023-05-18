import java.util.Scanner;

public class java10039 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int real =0;
        for (int i = 0; i < 5; i++) {
            int score = k.nextInt();

            if (score <40){
                real += 40;
            }
            else if (score >=40) {
                real +=score;
            }

        }
        System.out.println(real/5);



    }
}
