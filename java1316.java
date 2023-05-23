
import java.util.Scanner;

public class java1316 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int cnt = num1; //단어 전체가 그룹단어라고 가정

        for (int i = 0; i < num1; i++) {
            String str = k.next();
            boolean test[]= new boolean[26];//기본값은 True

            for (int j = 0; j < str.length()-1; j++) {
                if(str.charAt(i)!=str.charAt(i+1)){
                    if(test[str.charAt(i+1)-97]==true){
                        cnt--;
                        break;
                    }
                }
                test[str.charAt(i)-97]=true;
            }
        }
        System.out.println(cnt);

    }
}
