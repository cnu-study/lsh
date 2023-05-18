import java.util.Scanner;

public class java14656 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int students = k.nextInt();
        int num2 = 0;
        for (int i = 1; i < students+1; i++) {
            int num1 = k.nextInt();
            if (i==num1){
                num2+=1;
            }
        }
        System.out.println(students-num2);

    }
}
