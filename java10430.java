
import java.util.Scanner; //
public class java10430 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int A = k.nextInt();
        int B = k.nextInt();
        int C = k.nextInt();
        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);




    }
}

