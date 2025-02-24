import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] arr;
    static int min = 64;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];

        // TF 배열에 넣기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        // 8칸*8칸이라서
        int maxN = n-7;
        int maxM = m-7;

        for (int a = 0; a < maxN; a++) {
            for (int b = 0; b < maxM; b++) {
                check(a,b);
            }
        }
        System.out.println(min);
    }
    static void check(int low, int col) {
        int lastX = low+8;
        int lastY = col+8;
        int count = 0;
        boolean inspect = arr[low][col];
        for (int i = low; i < lastX; i++) {
            for (int j = col; j < lastY; j++) {
                if (arr[i][j] != inspect) {
                    count++;
                }
                inspect = !inspect;
            }
            inspect = !inspect;
        }
        // 64칸이니
        count= Math.min(count, 64-count);
        min = Math.min(min,count);
    }

}