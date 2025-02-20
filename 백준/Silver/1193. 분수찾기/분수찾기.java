import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String k = "1/1";
        if (n == 1) {
            System.out.println(k);
        } else {
            n = n-1;
            int a = 2;

            while (n > 0) {
                n -= a;
                int b = a+1;
                if (n <= 0) {
//                    System.out.println("n: "+n);
//                    System.out.println("a: "+a);
//                    System.out.println("b: "+b);
                    int c = n+a;
//                    System.out.println("c: "+c);
                    if (a % 2 == 0) {
                        System.out.println(n+a + "/" + (b-c));
                    } else {
                        System.out.println((b-c) + "/" + c);
                    }

                }
                a++;

            }

        }


    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}