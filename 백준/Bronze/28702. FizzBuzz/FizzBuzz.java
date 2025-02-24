import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] arr = new String[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = 0;
        for (int i = 0; i < 3; i++) {
            String a = br.readLine();
            if (isDigit(a)) {
                c = Integer.parseInt(a) + (2-i) + 1;
//                System.out.println(c);
                break;
            }
        }
        br.close();
        if (c % 3 != 0 && c % 5 != 0) {
            System.out.println(c);
        } else if (c % 3 == 0 && c % 5 != 0) {
            System.out.println("Fizz");
        } else if (c % 3 != 0 && c % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("FizzBuzz");
        }
    }

    static boolean isDigit (String str) {
        boolean result = true;
        for(char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                result = false;
            }
        }
        return result;
    }
}