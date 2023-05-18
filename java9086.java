import java.util.Scanner;

public class java9086 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int test = k.nextInt();
        for (int i = 0; i <test ; i++) {
            String str = k.next();
            System.out.println(str.charAt(0)+ "" +str.charAt(str.length()-1));


        }


    }


}
