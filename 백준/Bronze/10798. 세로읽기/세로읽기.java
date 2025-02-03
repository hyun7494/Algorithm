import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        int[] count = new int[5];
        StringBuilder sb = new StringBuilder();

        // br로 읽어 들여서 charArray
        for (int i = 0; i < 5; i++) {
            String n = br.readLine();
            arr[i] = n.toCharArray();
            count[i] = arr[i].length;
        }

        // 00 10 20 30 40 01 11 21 31 41 02 12 22 32 42
        for (int a = 0; a < 15; a++) {
            // 위 반복문의 i만큼 반복해야하는데
            for (int b = 0; b < 5; b++) {
                if (a < count[b]) {
                    sb.append(arr[b][a]);
                }
            }

        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}