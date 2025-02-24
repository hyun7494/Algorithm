import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        String str = br.readLine();
        char[] arr = str.toCharArray();
        for (int i = 1; i <= n; i++) {
            // 영어를 숫자로 바꿨을 때 값 찾기
            int a = arr[i-1]-96;
//            System.out.println("a: "+a);
            int mid = 1;
            //
            for (int j = 0; j<i; j++) {
                if (j == 0) {
                    mid *= a;
                } else {
                    mid *= 31;
                }

            }
            total += mid;
        }

        System.out.println(total);
    }
}