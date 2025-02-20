import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count ++;
                if (count == k) {
                    System.out.println(i);
                }
            }
            if (i == n && count < k) {
                System.out.println(0);
            }
        }


    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}