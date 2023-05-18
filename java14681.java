import java.util.Scanner;
public class java14681 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int X = k.nextInt();
        int Y = k.nextInt();
        if (X > 0 && Y>0) System.out.println("1");
        else if (X<0 && Y >0) System.out.println("2");
        else if (X<0&& Y<0) System.out.println("3");
        else  System.out.println("4");

    }
}

