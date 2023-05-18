import java.util.Scanner;

public class java14909 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int cnt = 0;
        while (k.hasNext()){
            int a = k.nextInt();
            if (a>0){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
