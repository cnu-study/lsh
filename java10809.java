import java.util.Arrays;
import java.util.Scanner;

public class java10809 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        String s = k.next();
        char[] arr = new char[26];

        for (int i = 0; i < 26; i++) {
            int c= i+97;
            char hope = (char)c;
            arr[i]=hope;


        }
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(Character.toString(arr[i]))) {
                System.out.print(s.indexOf(arr[i]));
            } else {
                System.out.print("-1");
            }
            System.out.print(" ");
        }


    }
}


