import java.util.Scanner;

public class java1152 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int cnt = 0;
        while(k.hasNext()){
            String sentence = k.next();
            cnt++;
        }
        System.out.println(cnt);
        k.close();
    }
}
