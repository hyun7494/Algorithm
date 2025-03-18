import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int n;
    static int k;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // n과 k가 같을 때
        if (n == k) {
            System.out.println(0);
        } else {
            bfs(n);
        }
    }

    static void bfs(int n) {
        Queue<Integer> que = new LinkedList<>();
        que.add(n);
        visited[n] = 1;
        int temp;

        while (!que.isEmpty()) {
            temp = que.poll();
            // 이동 가능한 위치들 탐색
            for (int next : new int[]{temp - 1, temp + 1, temp * 2}) {
                // 유효한 범위인지 확인 && 방문하지 않았는지 확인
                if (next >= 0 && next <= 100000 && visited[next] == 0) {
                    if (next == k) {
                        System.out.println(visited[temp]); // 최단 시간 출력
                        return;
                    }
                    que.add(next);
                    visited[next] = visited[temp] + 1; // 현재까지의 시간 갱신
                }

            }
        }
    }
}