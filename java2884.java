import java.util.Scanner;
public class java2884 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int H = k.nextInt();
        int M = k.nextInt();


        if (M >=45) System.out.printf("%s %s", H, M-45);
        if (M<45 && H !=0) System.out.printf("%s %s",H-1,60-(45-M));
        if (M<45 && H == 0) System.out.printf("%s %s",H+23, 60-(45-M));


        //9 25  8 40  8 15 7 30
    }
}

