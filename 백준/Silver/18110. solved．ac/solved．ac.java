import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // 몇명 잘라낼건지 체크
        int cut = (int) Math.round(n * 0.15);
//        System.out.println(cut);
        int total = 0;
        for (int j = cut; j < n - cut; j++) {
            total += arr[j];
        }
//        System.out.println("total: "+total);
//        System.out.println("버린거 빼고 수: "+ (n-cut*2));
        System.out.println(Math.round((float) total /(n-cut*2)));
        br.close();
    }
}