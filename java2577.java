import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class java2577 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int A = k.nextInt();
        int B = k.nextInt();
        int C = k.nextInt();
        int mul = A*B*C;
        // int mul = (k.nextInt()*k.nextInt()*k.nextInt());
        //이렇게 간단하게 한 줄로 할 수 있음

        String str = Integer.toString(mul);

        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

//        for (int i = 0; i < 10; i++) { //배열대신
//            int cnt = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if((str.charAt(j)-'0')==i){  문자에 해당하는 아스키 코드
//                    cnt++; //문자열 다 돌려봐서 i랑 같은 값있느면 +1 (i는1부터 순서대로 )
//                }
//            }
//            System.out.println(cnt);
//        }
        //0==48임 str.charAt()에 해당하는게 3(=51)이면 51-48=3
    }
}
