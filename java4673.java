//셀프넘퍼 생성자

//d(75) = 75+7+5 = 87, n을 d(n)의 생성자라고 한다.
//생성자가 없는 숫자를 셀프 넘버라고 한다.
//10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class java4673 {
    public static void main(String[] args) {
        boolean[] b = new boolean[10001]; //길이 10001짜리인데 a[0]제외

        for (int i = 1; i < 10001; i++) {
            int n = d(i); //i=1 이면 d(i)는 2(=n)

            if (n < 10001) {
                b[n] = true;  //b[2]=true (b[1]부터 시작)
            }

        }
        for (int i = 1; i < 10001; i++) {
            if (b[i] == false) { //생성자가 없는 애들
                System.out.println(i);
            }
        }
    }

    public static int d(int number) {
        int sum = number;  //sum에 n넣고 시작함
        while (number != 0) {
            sum += number % 10;//각 자리수 더해줌
            number = number / 10;
        }
        return sum; //n + 각자리수 합 반환
    }
}