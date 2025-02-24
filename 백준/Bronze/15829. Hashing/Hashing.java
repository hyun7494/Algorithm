import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger total = new BigInteger("0");
        String str = br.readLine();
        final int M = 1234567891;

        for (int i = 0; i < n; i++) {
            // 영어를 숫자로 바꿨을 때 값 찾기
            char c = str.charAt(i);
            long a = c-96;

            for (int j = 0; j < i; j++) {
                a *= 31;
                a %= M;
            }
            total = total.add(BigInteger.valueOf(a));
        }

        System.out.println(total.remainder(BigInteger.valueOf(M)));
    }
}