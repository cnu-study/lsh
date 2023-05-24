import java.util.Scanner;

public class java1924 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int month = k.nextInt();
        int day = k.nextInt();
        String[] arr = {"MON","TUE","WED","THU","FRI","SAT","SUN"} ;
        int[] m = {1,31,28,30,31,30,31,31,30,31,30,31};
        int n=0;
        for (int i = 0; i < month; i++) {
            n+=m[i];
        }
        n+=day-1;
        System.out.print(arr[n%7]);
    }
}
