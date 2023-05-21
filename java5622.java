import java.util.HashMap;
import java.util.Scanner;

public class java5622 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str = k.next();
        int[] arr = new int[26];
        int cnt = 2;
        int cnt3= 0;
        for (int i = 0; i <15 ; i++) {
            arr[i]=cnt;
            cnt3++;//i=0,1
            if(cnt3==3){
                cnt+=1;
                cnt3=0;
            }
        }

        for (int i = 15; i < 19; i++) {
            arr[i]=7;
        }
        for (int i = 19; i < 22; i++) {
            arr[i]=8;
        }
        for (int i = 22; i < 26; i++) {
            arr[i]=9;
        }
        int arrnum = 0;
        int cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arrnum= (int)c -65 ;
            cnt2+=(arr[arrnum]+1);

        }
        System.out.println(cnt2);


    }
}
