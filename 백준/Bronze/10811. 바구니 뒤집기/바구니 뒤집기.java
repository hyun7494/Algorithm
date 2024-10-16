import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();
        int repeat = stdIn.nextInt();
        int[] a = new int[count];

        for (int i = 1; i <= count; i++) {
            a[i-1] = i;
        }
        int[] b = a.clone();
        for (int j = 1; j <= repeat; j++) {
            int first = stdIn.nextInt()-1;
            int second = stdIn.nextInt()-1;
            int temp = 0;



            for (int l = second, m = first; l > m-1; m++,l--) {
                temp = b[m];
                b[m] = b[l];
                b[l] = temp;
            }
        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
