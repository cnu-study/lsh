import java.util.Scanner;

public class java1110 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int cnt =0;
        if (num1/10==0){
            System.out.println(1);
        }
        else{
            int newnum1 = num1;
            while(true){
                int fir = num1/10;
                int sec = num1-fir*10;
                int mid = fir+sec;
                if(mid>9){
                    cnt++;
                    mid=mid%10;
                    num1 = sec*10+mid;
                    if(newnum1==num1){
                        break;
                    }
                }
                else{
                    cnt++;
                    num1 = sec*10+mid;
                    if(newnum1==num1){
                        break;
                    }

                }

            }
        }
        System.out.println(cnt);

    }
}
