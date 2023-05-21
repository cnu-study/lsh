import java.util.Scanner;

public class java2908 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String num1 = k.next();
        String  num2 = k.next();
        StringBuilder sb = new StringBuilder(num1);
        sb.reverse();
        StringBuilder sb2 = new StringBuilder(num2);
        sb2.reverse();

//        String newNum1 = new StringBuilder(num1).reverse().toString();
//        String newNum2 = new StringBuilder(num2).reverse().toString();
        int intNum1  = Integer.parseInt(String.valueOf(sb));
        int intNum2  = Integer.parseInt(String.valueOf(sb2));

        int max = Math.max(intNum1, intNum2);
        System.out.println(max);
    }
}
