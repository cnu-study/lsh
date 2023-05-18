import java.util.Scanner;
public class java10807 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int N = k.nextInt();
        int[] a = new int[N];
        int cnt = 0;

        for (int i = 0; i <N ; i++) {
            a[i] = k.nextInt();
        }
        int V = k.nextInt();
        for (int i = 0; i < a.length ; i++) {
            if(V == a[i]){
                cnt++;
            }

        }
        System.out.println(cnt);





    }
}
