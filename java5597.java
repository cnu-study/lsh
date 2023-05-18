import java.util.Arrays;
import java.util.Scanner;


public class java5597 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] students = new int[30];
        for (int i = 0; i < 30; i++) {
            students[i]=i+1;

        }
        for (int i = 0; i < 28; i++) {
            int submit = k.nextInt();
            students[submit-1] =0;


        }
        for (int i = 0; i < 30; i++) {
            if (students[i]==0) {
                continue;
            }
            else if (students[i]!=0){
                System.out.println(students[i]);
            }


        }
    }
}

