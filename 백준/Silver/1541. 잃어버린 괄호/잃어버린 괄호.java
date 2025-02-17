import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 음의 다섯자리 수 이하로 해도 되는데 가독,유지보수,안정성 이유로 상수
        int sum = Integer.MAX_VALUE;

        // -부터 +전까지는 다 괄호로 묶기
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        br.close();

        while(st.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");

            while (st2.hasMoreTokens()) {
                temp += Integer.parseInt(st2.nextToken());
            }
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}