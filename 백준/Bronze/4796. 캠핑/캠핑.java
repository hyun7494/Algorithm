import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int count = 0;
        while(true) {
            count += 1;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i =0; i<3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if (arr[0]==0 && arr[1]==0 && arr[2]==0) {
                break;
            } else {
                int loop = arr[2]/arr[1];
//                System.out.println("loop: "+ loop);
                int add = arr[0];
                if (arr[2]%arr[1]<arr[0]) {
                    add = arr[2]%arr[1];
                }


//                System.out.println("add: "+ add);
                System.out.println("Case "+count+ ": " +(loop*arr[0]+add));
            }


        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}