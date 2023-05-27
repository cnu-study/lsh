import java.util.Scanner;

public class java1193 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int cnt = 0;
        int a =0;
        int b = 0;
        int sum =0;
        for (int i = 1; i < num1; i++) {


            if (num1 < i){
                i=num1-1;
                b = num1-sum;
                a=(cnt+1)-b;
                System.out.println(a+"/"+b);
            }
            else {
                if (i==num1){
                    b = num1-sum;
                    a=(cnt+1)-b;
                    System.out.println(a+"/"+b);
                }
                else{
                    num1 = num1 - i;
                    sum+=i;
                    cnt++;
                }

            }



        }








    }
}
