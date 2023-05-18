import java.util.Scanner;
import java.util.Stack;

public class java10828 {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        String st =k.next();
        for (int i = 0; i < N; i++) {
            if(st.equals("push")){
                int a = k.nextInt();
                stack.push(a);

            }
            else if (st.equals("top")){


            }

            else if (st.equals("size")){

            }
            else if (st.equals("empty")){

            }else if (st.equals("pop")){

            }

        }

    }
}
