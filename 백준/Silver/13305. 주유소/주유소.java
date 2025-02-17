import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 맨오른쪽까지 한번에 더한 것 부터 하나씩 줄여가면서
        // 각각의 부분마다 가장 싼값 찾기

        int N = Integer.parseInt(br.readLine());

        int[] length = new int[N-1];
        int[] price = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // length안에 넣기
        for (int i = 0; i < N-1; i++) {
            length[i] = Integer.parseInt(st.nextToken());
//            System.out.println(length[i]);
        }

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
//            System.out.println(price[i]);
        }

        // 최초 price의 값을 min에 넣고 뒤의 값들과 비교해서 작으면 변경
        int min = price[0];
        int total = 0;

        for (int i = 0; i < N-1; i++) {
            total += min * length[i];
            if (price[i+1] < min) {
                min = price[i+1];
            }
        }
        System.out.println(total);

        // 아니면 맨 왼쪽 가격이 오른쪽보다 저렴하면 그대로 유지
        // 오른쪽 가격이 왼쪽보다 비싸면 그대로 왼쪽가격 사용


    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}