import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class java1157 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String s = k.next();
        s.toUpperCase();
        HashMap<String,Integer>map = new HashMap<>();
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i);
        }
        int cnt=0;
        int[] arr2 = new int[s.length()];
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if (arr[i]==arr[j]){
                    cnt++;
                    arr[j]='a';
                    arr2[i]=cnt;

                }
                map.put("arr[i]",arr2[i]);
                cnt=0;

            }

        }
        Arrays.sort(arr2);
        if(arr[s.length()-1]==arr[s.length()-2]){
            System.out.println("?");
        }
        else{
            System.out.println();
        }


    }
}
