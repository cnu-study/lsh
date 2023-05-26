import java.util.HashMap;
import java.util.Scanner;

public class java2941 {
    public static void main(String[] args) {

        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        Scanner k = new Scanner(System.in);
        String a = k.next();
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            while(a.indexOf(arr[i])!=-1){
                a = a.replaceFirst(arr[i],"A");
                cnt++;



            }
        }
        a = a.replace("A","");
        System.out.println(a.length()+cnt);
    }

}
