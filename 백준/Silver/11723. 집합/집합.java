import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 수행해야 하는 연산 수
        int m = Integer.parseInt(st.nextToken());

        // 담아둘 배열
        int[] arr = new int[21];


        // 명령 반복하기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()," ");
//            System.out.println(i);
            // 명령
            String order = st.nextToken();
            int x;
            if (order.equals("all") || order.equals("empty")) {
//                System.out.println("all 아니면 empty다");
                switch (order){
                    case "all":
                        for (int j = 1; j < 21; j++) {
                            arr[j] = 1;
                        }
                        break;
                    case "empty":
                        for (int j = 1; j < 21; j++) {
                            arr[j] = 0;
                        }
                        break;
                }
            } else {
//                System.out.println("일바 계산이다");
                // x
                x = Integer.parseInt(st.nextToken());
                switch (order) {
                    case "add":
                        arr[x] = 1;
                        break;
                    case "remove":
                        arr[x] = 0;
                        break;
                    case "check":
                        if (arr[x] == 1) {
                            sb.append(1);
                            sb.append("\n");
                        } else {
                            sb.append(0);
                            sb.append("\n");
                        }
                        break;
                    case "toggle":
                        if (arr[x] == 0) {
                            arr[x] = 1;
                        } else {
                            arr[x] = 0;
                        }
                        break;
                }
            }

            //

        }
        br.close();
        System.out.println(sb);
    }
}