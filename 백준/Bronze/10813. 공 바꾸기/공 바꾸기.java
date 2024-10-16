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
        for (int j = 1; j <= repeat; j++) {
            int first = stdIn.nextInt()-1;
            int second = stdIn.nextInt()-1;
            int temporary = 0;

            temporary = a[first];
            a[first] = a[second];
            a[second] = temporary;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
