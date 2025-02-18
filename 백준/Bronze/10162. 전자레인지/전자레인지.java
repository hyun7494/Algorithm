import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄
        int T = Integer.parseInt(br.readLine());


        int[] time = {300, 60, 10};
        int[] count = new int[3];

        if (T%10 == 0) {
            for (int i = 0; i<3; i++) {
                count[i] = T/time[i];
                T = T%time[i];
            }
        } else {
            System.out.println(-1);
        }

        if (T%10 ==0) {
            System.out.println(count[0]+" "+count[1]+" "+count[2]);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}