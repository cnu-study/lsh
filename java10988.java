import java.util.Scanner;
public class java10988 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str= k.nextLine();
        char[]arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                System.out.print("0");
                break;
            }
            else{
                if (i == arr.length-1){
                    System.out.print("1");
                }

            }
        }


    }
}


